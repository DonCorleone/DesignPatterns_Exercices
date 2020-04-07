package com.codewithmosh.chainOfResponsibility;

public class Numbers extends Handler {
    protected Numbers(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(String filename) {
        if (filename.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}
