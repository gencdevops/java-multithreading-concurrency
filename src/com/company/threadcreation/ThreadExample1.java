package com.company.threadcreation;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("merhaba"));
        t1.start();
    }
}
