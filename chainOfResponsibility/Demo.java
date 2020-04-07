package com.codewithmosh.chainOfResponsibility;

public class Demo {
    public static void show(){

        Bankster bankster = new Bankster(null);
        Numbers numbers = new Numbers(bankster);
        Excel excel = new Excel(numbers);

        DataReader dataReader = new DataReader(excel);

        dataReader.read("HelloWorld.numbers");
    }
}
