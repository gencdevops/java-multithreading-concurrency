package com.company.threadcreation;

public class ThreadExample4 {
    static Runnable myRunnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("MyRunnable");
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
