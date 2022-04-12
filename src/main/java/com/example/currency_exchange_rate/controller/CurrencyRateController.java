package com.example.currency_exchange_rate.controller;

import com.example.currency_exchange_rate.service.CurrencyRateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRateController {

    private final CurrencyRateService service;

    public CurrencyRateController(CurrencyRateService service) {
        this.service = service;
    }

    @GetMapping("/currency")
    public ResponseEntity<byte[]> getGiphy() {
        return service.getGiphy();
    }
}
