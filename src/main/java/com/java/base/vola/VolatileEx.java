package com.java.base.vola;

public class VolatileEx {

    static volatile boolean vFlag = false;

    static boolean flag = false;

    public static void vChange () {
        while (!vFlag) {

        }
        System.out.println("vFlag的值改变了，变成了：" + vFlag);
    }

    public static void changeVFlag () {
        try {
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("我要开始改变vFlag的值了");
        vFlag = true;
    }

    public static void flagChange() {
        int i = 0;
        while (!flag) {
            try {
                System.out.println(i);
                i++;
                Thread.sleep(100);
            }catch (Exception e) {
                e.printStackTrace();
            }
            if(i > 4000) {
                System.out.println("我没等上flag的值改变，我先断了");
                break;
            }
        }
        System.out.println("flag的值变了，变成了：" + flag);
    }

    public static void changeFlag () {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("我要开始改变flag的值了");
        flag = true;
    }

    public static void main(String[] args) {

        new Thread("a") {
            @Override
            public void run() {
                vChange();
            }
        }.start();

        new Thread("b") {
            @Override
            public void run() {
                changeVFlag();
            }
        }.start();

        new Thread("c") {
            @Override
            public void run() {
                flagChange();
            }
        }.start();

        new Thread("d") {
            @Override
            public void run() {
                changeFlag();
            }
        }.start();
    }
}
