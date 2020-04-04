package com.codewithmosh.observer;

public class Demo {

    public static void show(){
        Stock stock1 = new Stock("stock1", 6.0f);
        Stock stock2 = new Stock("stock2", 6.0f);
        Stock stock3 = new Stock("stock3", 6.0f);

        StatusBar statusBar = new StatusBar();
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        StockListView stockListView = new StockListView();
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        stock1.setPrice(11.0f);
        stock2.setPrice(22.0f);
        stock3.setPrice(23.0f);
    }
}
