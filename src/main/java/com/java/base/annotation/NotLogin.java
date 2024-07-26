package com.java.base.annotation;

import java.lang.annotation.*;

/**
 * 不需要登录
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotLogin {

    public String value() default "";

    public String description() default "";
}
