package com.java.base.annotation;

import java.lang.annotation.*;

/**
 * 游客模式，登录和不登录都行
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Visitor {

    public String value() default "";

    public String description() default "";
}
