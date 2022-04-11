package com.example.currency_exchange_rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyExchangeRateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeRateApplication.class, args);
    }

}
