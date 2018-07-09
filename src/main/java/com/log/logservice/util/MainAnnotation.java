package com.log.logservice.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author  liuhuan
 * 自定义日志注解
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MainAnnotation {

	int maintype() default 0;
	String type() default "0";
	String tables() default  "";
	String desc() default  "";
}
