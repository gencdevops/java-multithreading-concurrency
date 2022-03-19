package com.company.threadcreation;

public class ThreadExample6 {
    public static void main(String[] args) {
        Runnable r1=()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(" is running");
        };

        Thread t1 = new Thread(r1,"Thread 1");
        Thread t2=new Thread(r1,"Thread 2");
        t1.start();
        t2.start();
    }
}
