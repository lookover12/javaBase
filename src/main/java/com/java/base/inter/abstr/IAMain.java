package com.java.base.inter.abstr;

public class IAMain {

    public static void main(String[] args) {
        AbstractClassExample abstractClassExample = new AbstractExtendClassExample();
        abstractClassExample.method();
        abstractClassExample.method1();

        InterfaceClassExample interfaceClassExample = new InterfaceImplClassExample();
        interfaceClassExample.interfaceMethod();
    }
}
