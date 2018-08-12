package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World! today is AUg-12 : 12:22";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
