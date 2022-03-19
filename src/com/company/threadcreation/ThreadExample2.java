package com.company.threadcreation;

public class ThreadExample2 {
    private class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("my thread");
        }
    }

    public static void main(String[] args) {
        ThreadExample2 threadExample2 = new ThreadExample2();
        ThreadExample2.MyThread myThread = threadExample2.new MyThread();

        myThread.start();
    }
}
