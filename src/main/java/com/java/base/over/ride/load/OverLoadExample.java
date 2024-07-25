package com.java.base.over.ride.load;

public class OverLoadExample {

    public void overLoadMethod() {
        System.out.println("重载方法1");
    }

    public void overLoadMethod(String para) {
        System.out.println("重载方法2，参数：" + para);
    }
}
