package com.coderscampus.Week14.alphaadvantage;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class AlphaAdvantageIntegration {

    @Test
    public void callApiExample() {
        RestTemplate rt = new RestTemplate();


        // https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=demo
        URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
                                      .queryParam("function", "TIME_SERIES_INTRADAY")
                                      .queryParam("symbol", "TSLA")
                                      .queryParam("interval", "5min")
                                      .queryParam("apikey","660BM5BMS4ZM41VT")
                                      .build()
                                      .toUri();

        ResponseEntity<String> response = rt.getForEntity(uri, String.class);
        System.out.println(response);
    }
}
