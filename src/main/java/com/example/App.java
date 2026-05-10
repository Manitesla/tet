package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Docker Java Demo Application ");
        System.out.println("=================================");

        System.out.println("Application started successfully!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing step : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Application completed.");
    }
}
