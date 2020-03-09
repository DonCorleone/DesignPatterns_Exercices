package com.codewithmosh.strategy;
/**
 * Demo
 */
public class Demo {

    public static void show() {

        var chat = new ChatClient(new Aes());
        String message = "Hello World";
        var encryptedMessage = chat.send(message);

        System.out.println(encryptedMessage);
    }
}