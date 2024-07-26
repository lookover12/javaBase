package com.java.base.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 拦截是否需要登录
 */

public class InterceptorLogin {

    private static final int NOT_LOGGED_IN = 0;

    private static final int LOGGED_IN = 1;

    private static final int NO_LOGGED_IN = 2;

    //由于method没有参数，所以为了模拟，直接传参了
    public int checkIsLogin(Class zlass, Method method, String userName) {
        //1.首先判断类上是否存在上述三类需要校验登录的注解
        if(zlass.isAnnotationPresent(NotLogin.class)) {
            return NOT_LOGGED_IN;
        }

        if(zlass.isAnnotationPresent(Visitor.class)) {
            return dealVisitor(method, userName);
        }

        if(zlass.isAnnotationPresent(Auth.class)) {
            return dealAuth(method, userName);
        }

        //2.判断方法的注解
        if(method.isAnnotationPresent(NotLogin.class)) {
            return NOT_LOGGED_IN;
        }

        if(method.isAnnotationPresent(Visitor.class)) {
            return dealVisitor(method, userName);
        }

        if(method.isAnnotationPresent(Auth.class)) {
            return dealAuth(method, userName);
        }

        //没有配置任何注解，也不需要登录
        return NOT_LOGGED_IN;
    }

    private int dealVisitor(Method method, String userName) {
        //获取method里面的参数，判断是否存在userName
        Parameter[] parameters = method.getParameters();
        for(Parameter parameter : parameters) {
            if(userName != null) {
                System.out.println("游客模式，方法：" + method.getName() + "获取到用户信息");
                System.out.println("记录访问日志：用户" + parameter.getType().getName() + "访问了" + method.getName() + "方法");
                return LOGGED_IN;
            }
//            if(parameter.getName().equals("userName")) {
//                System.out.println("游客模式，方法：" + method.getName() + "获取到用户信息");
//                System.out.println("记录访问日志：用户" + parameter.getType().getName() + "访问了" + method.getName() + "方法");
//                return LOGGED_IN;
//            }
        }
        return NOT_LOGGED_IN;
    }

    private int dealAuth(Method method, String userName) {
        //获取method里面的参数，判断是否存在userName
        Parameter[] parameters = method.getParameters();
        for(Parameter parameter : parameters) {
            if(userName != null) {
                System.out.println("游客模式，方法：" + method.getName() + "获取到用户信息");
                System.out.println("记录访问日志：用户" + parameter.getType().getName() + "访问了" + method.getName() + "方法");
                return LOGGED_IN;
            }
//            if(parameter.getName().equals("userName")) {
//                System.out.println("游客模式，方法：" + method.getName() + "获取到用户信息");
//                System.out.println("记录访问日志：用户" + parameter.getType().getName() + "访问了" + method.getName() + "方法");
//                return LOGGED_IN;
//            }
        }

        return NO_LOGGED_IN;
    }
}
