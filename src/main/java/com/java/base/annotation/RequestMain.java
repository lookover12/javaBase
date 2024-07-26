package com.java.base.annotation;

/**
 * 模拟请求接口
 */

public class RequestMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        InterceptorLogin login = new InterceptorLogin();
        System.out.println("访问商品列表，没有用户信息。返回的结果：" + login.checkIsLogin(GoodsController.class
                , GoodsController.class.getMethod("goodsList", String.class), null));
        System.out.println("访问商品列表，带有用户信息。返回的结果：" + login.checkIsLogin(GoodsController.class
                , GoodsController.class.getMethod("goodsList", String.class), "zhangsan"));

        System.out.println("访问商品信息，没有用户信息。返回的结果：" + login.checkIsLogin(GoodsController.class
                , GoodsController.class.getMethod("goodsInfo", String.class), null));
        System.out.println("访问商品信息，带有用户信息。返回的结果：" + login.checkIsLogin(GoodsController.class
                , GoodsController.class.getMethod("goodsInfo", String.class), "zhangsan"));

        System.out.println("访问用户信息，没有用户信息。返回的结果：" + login.checkIsLogin(UserController.class
                , UserController.class.getMethod("getUserInfo", String.class), null));
        System.out.println("访问用户信息，带有用户信息。返回的结果：" + login.checkIsLogin(UserController.class
                , UserController.class.getMethod("getUserInfo", String.class), "zhangsan"));

        System.out.println("访问广告信息，没有用户信息。返回的结果：" + login.checkIsLogin(AdvertiseController.class
                , AdvertiseController.class.getMethod("advertiseInfo"), null));
        System.out.println("访问广告信息，带有用户信息。返回的结果：" + login.checkIsLogin(AdvertiseController.class
                , AdvertiseController.class.getMethod("advertiseInfo"), "zhangsan"));
    }
}
