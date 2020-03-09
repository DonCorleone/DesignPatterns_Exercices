package com.codewithmosh.strategy;

public class Aes implements Encryption {

    @Override
    public String encrypt(String messsage){

        System.out.println("Encrypting message using AES");
        return "AESxxx";
    }
}