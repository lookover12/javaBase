package com.java.base.annotation;

import java.lang.annotation.*;

/**
 * 必须登录
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Auth {

    public String value() default "";

    public String description() default "";
}
