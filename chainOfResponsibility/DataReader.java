package com.codewithmosh.chainOfResponsibility;

public class DataReader {
    private Handler fileHandler;

    public DataReader(Handler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public void read(String filename) {

        fileHandler.handle(filename);
    }
}
