package com.java.base.sync;

public class ObjectObjectSync implements Runnable {
    static ObjectObjectSync objectSync = new ObjectObjectSync();

    Object object1 = new Object();
    Object object2 = new Object();

    @Override
    public void run() {
        synchronized (object1) {
            try {
                System.out.println("我是线程" + Thread.currentThread() + "在运行object1");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread() + "运行object1结束");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        synchronized (object2) {
            try {
                System.out.println("我是线程" + Thread.currentThread() + "正在运行object2");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread() + "运行object2结束");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(objectSync);
        Thread t2 = new Thread(objectSync);
        t1.start();
        t2.start();
    }
}
