package com.company.threadcreation;

public class ThreadExample7 {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequest=false;

        public synchronized void requestStop(){
            this.stopRequest=true;
        }

        public synchronized boolean isStopRequested(){
            return this.stopRequest;
        }

        private void sleep(long millis){
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("stoppable runnable is running");
            while(!isStopRequested()){
                sleep(1000);
                System.out.print(".");
            }
            System.out.println("stopped");
        }
    }
    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable=new StoppableRunnable();
        Thread t1=new Thread(stoppableRunnable);
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stoppableRunnable.requestStop();
    }
}
