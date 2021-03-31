package com.mytests.spring.useLibrariesTest;

import com.mytests.spring.useLibrariesTest.components.Compo1;
import com.mytests.spring.useLibrariesTest.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
public class RunMe {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        ctx.getBean(Compo1.class).displayCompo1();
    }

}