package com.java.base.sync;

public class MethodStaticSync implements Runnable {
    static MethodStaticSync m = new MethodStaticSync();
    static MethodStaticSync m1 = new MethodStaticSync();

    public void run() {
        method();
    }

    //synchronized修饰静态方法上，默认锁是当前所在class类
    public static synchronized void method() {
        try {
            System.out.println("我是线程：" + Thread.currentThread());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread() + "结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();
    }
}
