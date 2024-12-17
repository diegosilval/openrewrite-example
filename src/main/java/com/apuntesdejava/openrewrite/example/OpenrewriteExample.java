package com.apuntesdejava.openrewrite.example;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class OpenrewriteExample {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyFactory factory = KeyFactory.getInstance("EC");
        StringBuilder sb = new StringBuilder("A dummy text");
        KeyFactory factory0 = (KeyFactory) KeyFactory.getInstance("EC");
        AClass aObject = new AClass();
        KeyFactory factory1 = factory;
        BClass bObject = BClass.getInstance();
        List<String> list = List.of("one", "two", "three", "four");
        Path path = Path.of("debug.log");
        InputStream stream = Files.newInputStream(path);

    }
}

class AClass {
}

class BClass {
    private static BClass INSTANCE;

    private BClass() {
    }

    public static BClass getInstance() {
        return INSTANCE == null ? INSTANCE = new BClass() : INSTANCE;

    }
}