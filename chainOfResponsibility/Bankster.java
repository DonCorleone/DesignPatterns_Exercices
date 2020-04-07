package com.codewithmosh.chainOfResponsibility;

public class Bankster extends Handler {
    public Bankster(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(String filename) {
        if (filename.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }
        return false;
    }
}
