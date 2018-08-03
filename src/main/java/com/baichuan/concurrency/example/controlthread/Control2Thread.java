package com.baichuan.concurrency.example.controlthread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 控制线程的执行顺序
 */
public class Control2Thread {

    static Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread1");
        }
    });
    static Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread2");
        }
    });
    static Thread thread3=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3");
        }
    });
   static ExecutorService executorService= Executors.newSingleThreadExecutor();
    public static void main(String[] args) {

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
    }
}
