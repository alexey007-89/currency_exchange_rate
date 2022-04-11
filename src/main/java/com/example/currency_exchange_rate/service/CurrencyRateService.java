package com.example.currency_exchange_rate.service;

import com.example.currency_exchange_rate.client.GiphyApiClient;
import com.example.currency_exchange_rate.client.OpenexchangeratesApiClient;
import org.asynchttpclient.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

@Service
public class CurrencyRateService {

    private final OpenexchangeratesApiClient openexchangeratesApi;
    private final GiphyApiClient giphyApi;

    @Value("${giphy.api-key}")
    private String giphyApiKey;
    @Value("${openexchangerates.api-key}")
    private String openexchangeratesApiKey;
    @Value("${path-to-file}")
    private String filepath;
    @Value("${openexchangerates.currency}")
    private String currency;

    public CurrencyRateService(OpenexchangeratesApiClient openexchangeratesApi, GiphyApiClient giphyApi) {
        this.openexchangeratesApi = openexchangeratesApi;
        this.giphyApi = giphyApi;
    }

    private String getTag() {
        double currentRate = openexchangeratesApi
                .getLatestCurrency(openexchangeratesApiKey, currency)
                .getRates().getRub();
        Long i = 1L;
        String previousDate = getStringDateMinusDays(i);
        double previousRate = openexchangeratesApi
                .getCurrencyByDate(previousDate,openexchangeratesApiKey,currency)
                .getRates().getRub();
        while (previousRate == currentRate) {
            previousDate = getStringDateMinusDays(++i);
            previousRate = openexchangeratesApi
                    .getCurrencyByDate(previousDate, openexchangeratesApiKey, currency)
                    .getRates().getRub();
        }
        if (previousRate > currentRate) {
            return "broke";
        }
        return "rich";
    }

    private String getStringDateMinusDays(Long days) {
        LocalDateTime ldt = LocalDateTime.now().minusDays(days);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        return format.format(ldt);
    }
    
    public void downloadFile() throws ExecutionException, InterruptedException, IOException {

        String url = giphyApi.getGifByTag(giphyApiKey, getTag()).getData().getImages().getOriginal().getUrl();
        url = url.substring(0, url.indexOf('?'));
        FileOutputStream stream = new FileOutputStream(filepath);
        AsyncHttpClient client = Dsl.asyncHttpClient();

        client.prepareGet(url)
                .execute(new AsyncCompletionHandler<FileOutputStream>() {

                    @Override
                    public State onBodyPartReceived(HttpResponseBodyPart bodyPart) throws Exception {
                        stream.getChannel()
                                .write(bodyPart.getBodyByteBuffer());
                        return State.CONTINUE;
                    }

                    @Override
                    public FileOutputStream onCompleted(Response response) {
                        return stream;
                    }
                })
                .get();

        stream.getChannel().close();
        client.close();
    }

}
