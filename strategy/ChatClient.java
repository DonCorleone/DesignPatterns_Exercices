package com.codewithmosh.strategy;

public class ChatClient {

    private Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String send(String message) {        
        System.out.println("Sending the encrypted message...");
        return encryptionAlgorithm.encrypt(message);
    }
}
