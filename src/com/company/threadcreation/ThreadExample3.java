package com.company.threadcreation;

public class ThreadExample3 {
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("My thread");
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();
    }
}
