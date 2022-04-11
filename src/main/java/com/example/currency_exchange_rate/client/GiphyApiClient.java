package com.example.currency_exchange_rate.client;

import com.example.currency_exchange_rate.model.GifObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "giphyApi", url = "${giphy.url}")
public interface GiphyApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/random?api_key={api-key}&tag={giphy-tag}&rating=g")
    GifObject getGifByTag(@PathVariable("api-key") String giphyApiKey,
                          @PathVariable("giphy-tag") String tag);
}
