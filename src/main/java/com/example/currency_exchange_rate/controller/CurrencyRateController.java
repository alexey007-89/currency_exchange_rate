package com.example.currency_exchange_rate.controller;

import com.example.currency_exchange_rate.service.CurrencyRateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;

@RestController
public class CurrencyRateController {

    private final CurrencyRateService service;

    @Value("${path-to-file}")
    private String filepath;

    public CurrencyRateController(CurrencyRateService service) {
        this.service = service;
    }

    @GetMapping("/currency")
    public void getGiphy(HttpServletResponse response) throws IOException, ExecutionException, InterruptedException {
        service.downloadFile();
        Path path = Path.of(filepath);
        try (InputStream is = Files.newInputStream(path);
             OutputStream os = response.getOutputStream()) {
            response.setStatus(200);
            is.transferTo(os);
        }

    }
}
