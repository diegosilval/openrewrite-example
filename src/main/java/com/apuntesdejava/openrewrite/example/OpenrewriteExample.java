package com.apuntesdejava.openrewrite.example;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;

public class OpenrewriteExample {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyFactory factory = KeyFactory.getInstance("EC");
        StringBuilder sb = new StringBuilder("A dummy text");
    }
}
