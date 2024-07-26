package com.java.base.annotation;

/**
 * 获取用户信息接口
 */

@Auth(value = "userController", description = "用户信息")
public class UserController {

    /**
     * 获取用户信息，以为这是java项目例子。所有拦截参数里面是否包含用户信息
     * @return
     */
    public String getUserInfo(String userName) {
        return "zhangsan";
    }
}
