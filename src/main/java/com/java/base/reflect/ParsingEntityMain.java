package com.java.base.reflect;

import java.lang.reflect.Field;

public class ParsingEntityMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //三种获取方式
        Class<Cat> catClass = Cat.class;
        Class<Cat> catClass1 = (Class<Cat>) new Cat().getClass();
        Class<Cat> catClass2 = (Class<Cat>) Class.forName("com.java.base.reflect.Cat");
        System.out.println("根据类名获取：" + catClass);
        System.out.println("根据对象获取：" + catClass1);
        System.out.println("根据全限定类名获取：" + catClass2);

        //开始解析
        System.out.println("打印getName():" + catClass.getName());
        System.out.println("打印getSimpleName():" + catClass.getSimpleName());
        System.out.println("打印getCanonicalName():" + catClass.getCanonicalName());
        System.out.println("Cat是否是接口：" + catClass.isAnnotation() + "根据isAnnotation()方法");
        Class[] interfaces = catClass.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Cat类实现的接口：" + i);
        }

        Class superclass = catClass.getSuperclass();
        System.out.println("Cat类继承了：" + superclass);

        Cat cat = catClass.newInstance();
        System.out.println("使用newInstance()方法创建Cat实例" + cat);

        Field[] fields = catClass.getFields();
        System.out.println("获取Cat类中所有public字段，包括父类");
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field[] declaredFields = catClass.getDeclaredFields();
        System.out.println("获取Cat类中所有字段，不包括父类");
        for (Field f : declaredFields) {
            System.out.println(f.getName());
        }
    }
}
