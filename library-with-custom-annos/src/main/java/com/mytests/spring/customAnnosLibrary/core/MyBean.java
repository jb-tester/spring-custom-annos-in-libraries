package com.mytests.spring.customAnnosLibrary.core;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Bean
public @interface MyBean {
    @AliasFor(annotation = Bean.class, attribute = "name")
    String[] name() default {};
}
