package com.example.currency_exchange_rate.service;

import com.example.currency_exchange_rate.client.GiphyApiClient;
import com.example.currency_exchange_rate.client.OpenexchangeratesApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;

@Service
public class CurrencyRateService {

    private final OpenexchangeratesApiClient openexchangeratesApi;
    private final GiphyApiClient giphyApi;

    @Value("${giphy.api-key}")
    private String giphyApiKey;
    @Value("${openexchangerates.api-key}")
    private String openexchangeratesApiKey;
    @Value("${openexchangerates.currency}")
    private String currency;

    public CurrencyRateService(OpenexchangeratesApiClient openexchangeratesApi, GiphyApiClient giphyApi) {
        this.openexchangeratesApi = openexchangeratesApi;
        this.giphyApi = giphyApi;
    }

    public ResponseEntity<byte[]> getGiphy() {
        String url = getUrl();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.IMAGE_GIF));
        HttpEntity<Void> httpEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, httpEntity, byte[].class);
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

    private String getUrl() {
        String url = giphyApi.getGifByTag(giphyApiKey, getTag()).getData().getImages().getDownsized().getUrl();
        url = url.substring(0, url.indexOf('?'));
        return url;
    }

}
