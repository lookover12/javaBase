package com.java.base.over.ride.load;

public class OverRideLoadMain {

    public static void main(String[] args) {
        //重写
        OverRideParent overRideParent = new OverRideExample();
        overRideParent.method();

        OverRideParent overRideParent1 = new OverRideParent();
        overRideParent1.method();

        //重载
        OverLoadExample overLoadExample = new OverLoadExample();
        overLoadExample.overLoadMethod();
        overLoadExample.overLoadMethod("1111");
    }
}
