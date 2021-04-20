package com.coderscampus.Week14.alphaadvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TimeSeries {

    @JsonProperty("2021-04-19 20:00:00")
    private StockData stockData1;

    public StockData getStockData1() {
        return stockData1;
    }

    public void setStockData1(StockData stockData1) {
        this.stockData1 = stockData1;
    }
}
