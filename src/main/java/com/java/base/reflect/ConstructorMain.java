package com.java.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> zlass = null;
        zlass = Class.forName("com.java.base.reflect.User");

        //1.通过无参构造方法实例化对象，要是不存在则报错
        User user = (User) zlass.newInstance();
        user.setAge(11);
        user.setName("张三");
        System.out.println(user.toString());
        System.out.println("----------------");

        //2.获取指定参数的构造函数
        Constructor constructor1 = zlass.getConstructor(String.class);
        User user1 = (User) constructor1.newInstance("李四");
        user1.setAge(15);
        System.out.println(user1.toString());
        System.out.println("----------------");

        //3.获取指定参数的构造函数(包括private)
        Constructor constructor2 = zlass.getDeclaredConstructor(String.class, int.class);

        //由于是私有方法，必须设置可访问
        constructor2.setAccessible(true);
        User user2 = (User) constructor2.newInstance("王五", 11);
        System.out.println(user2.toString());
        System.out.println("----------------");

        //4.获取所有public构造方法
        Constructor[] constructors = zlass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("构造方法名称：" + constructor.getName() + "，构造方法类型长度：" + constructor.getParameterTypes().length);
        }
        System.out.println("----------------");

        //5.获取所有构造方法
        Constructor[] constructorsAll = zlass.getDeclaredConstructors();
        for (Constructor constructor : constructorsAll) {
            System.out.println("构造方法名称：" + constructor.getName() + "，构造方法类型长度：" + constructor.getParameterTypes().length);
        }
    }
}
