package com.java.base.sync;

//重入锁(循环调用)

public class RepeatSync {

    public static void main(String[] args) {
        RepeatSync sync = new RepeatSync();
        sync.method();
    }

    public synchronized void method() {
        System.out.println("方法method()，当前线程id:" + Thread.currentThread().getId());
        method2();
    }

    public synchronized void method2() {
        System.out.println("方法method2()，当前线程id:" + Thread.currentThread().getId());
        method3();
    }

    public synchronized void method3() {
        System.out.println("方法method3()，当前线程id:" + Thread.currentThread().getId());
    }
}
