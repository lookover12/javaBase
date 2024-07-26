package com.java.base.annotation;

/**
 * 广告接口
 */

public class AdvertiseController {

    /**
     * 获取广告信息，不需要登录
     * @return
     */

    @NotLogin(value = "advertiseInfo", description = "获取广告信息")
    public String advertiseInfo() {
        return "advertise info";
    }
}
