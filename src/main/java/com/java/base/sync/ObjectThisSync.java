package com.java.base.sync;

/**
 * 对象类，this是当前对象
 */

public class ObjectThisSync implements Runnable {
    static ObjectThisSync obj = new ObjectThisSync();

    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("我是线程：" + Thread.currentThread());
                Thread.sleep(3000);
                System.out.println(Thread.currentThread() + "结束");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(obj);
        Thread thread1 = new Thread(obj);
        thread.start();
        thread1.start();
    }
}
