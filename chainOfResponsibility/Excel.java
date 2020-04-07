package com.codewithmosh.chainOfResponsibility;

public class Excel extends Handler {

    protected Excel(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(String filename) {
        if (filename.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
