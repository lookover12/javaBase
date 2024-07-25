package com.java.base.equal;

public class EqualMain {

    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");
        String c = "a";
        String d = "a";

        System.out.print("a的值");
        System.out.println(a);
        System.out.print("b的值");
        System.out.println(b);
        System.out.print("c的值");
        System.out.println(c);
        System.out.print("d的值");
        System.out.println(d);
        System.out.println("a.equals(b)的值" + a.equals(b));
        System.out.println("a.equals(c)的值" + a.equals(c));
        System.out.println("a.equals(d)的值" + a.equals(d));
        System.out.print("a=b的值");
        System.out.println(a == b);
        System.out.print("a=c的值");
        System.out.println(a == c);
        System.out.print("c=d的值");
        System.out.println(c == d);
    }
}
