package com.example.currency_exchange_rate.client;

import com.example.currency_exchange_rate.model.CurrencyObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "openexchangeratesApi", url = "${openexchangerates.url}")
public interface OpenexchangeratesApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/historical/{date}.json?app_id={api-key}&base={currency}&symbols=RUB")
    CurrencyObject getCurrencyByDate (@PathVariable("date") String date,
                                      @PathVariable("api-key") String openexchangeratesApiKey,
                                      @PathVariable("currency") String currency);

    @RequestMapping(method = RequestMethod.GET, value = "/latest.json?app_id={api-key}&base={currency}&symbols=RUB")
    CurrencyObject getLatestCurrency (@PathVariable("api-key") String openexchangeratesApiKey,
                                   @PathVariable("currency") String currency);
}
