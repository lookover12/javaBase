package com.java.base.sync;

/**
 * 方法锁。锁对象默认为this
 */

public class MethodSync implements Runnable{
    static MethodSync methodSync = new MethodSync();

    @Override
    public void run() {
        method();
    }

    public synchronized void method() {
        try {
            System.out.println("我是线程：" + Thread.currentThread());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread() + "结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(methodSync);
        Thread thread1 = new Thread(methodSync);
        thread.start();
        thread1.start();
    }
}
