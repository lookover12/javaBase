package com.java.base.annotation;

/**
 * 商品相关接口
 */

public class GoodsController {

    /**
     * 这是获取商品列表接口，游客模式就能访问。登录就获取用户信息做标记，不登录就不操作
     * @return
     */
    @Visitor(value = "goodsList", description = "获取商品列表")
    public String goodsList(String userName) {
        return "iphone15, iphone14";
    }

    /**
     * 获取商品详情信息，这个接口必须登录。需要获取用户的点击信息
     * @return
     */
    @Auth(value = "goodsInfo", description = "获取商品信息")
    public String goodsInfo(String userName) {
        return "iphone15";
    }
}
