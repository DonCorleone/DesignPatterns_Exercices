package com.codewithmosh.strategy;

/**
 * Des
 */
public class Des implements Encryption {

    @Override
    public String encrypt(String messsage){

        System.out.println("Encrypting message using DES");
        return "DESxxx";
    }
}