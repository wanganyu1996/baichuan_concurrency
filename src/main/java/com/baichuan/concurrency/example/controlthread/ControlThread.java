package com.baichuan.concurrency.example.controlthread;

/**
 * 控制线程的执行顺序
 */
public class ControlThread {

    static Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    });
    static Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    });
    static Thread thread3=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    });

    public static void main(String[] args) {

        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
