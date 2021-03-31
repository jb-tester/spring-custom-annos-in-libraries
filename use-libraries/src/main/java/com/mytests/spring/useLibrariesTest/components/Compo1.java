package com.mytests.spring.useLibrariesTest.components;

import com.mytests.spring.customAnnosLibrary.core.MyComponent;
import com.mytests.spring.customBeans.beans.LibBean1;
import com.mytests.spring.customBeans.components.LibCompo2;
import com.mytests.spring.customBeans.components.LibCompo3;
import com.mytests.spring.customBeans.conf.LibCompo1;
import com.mytests.spring.useLibrariesTest.beans.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@MyComponent
public class Compo1 {

    @Autowired
    private LibBean1 libBean1;        //autowiring error - https://youtrack.jetbrains.com/issue/IDEA-265629

    @Autowired @Qualifier("libBeanFromLibConfig") //autowiring error - https://youtrack.jetbrains.com/issue/IDEA-265629
    private String stringMyBeanFromLibConfig;

    @Autowired @Qualifier("normalStr")
    private String stringBeanFromLibConfig;
    
    
    @Autowired
    private LibCompo1 libCompoFromLibConfig;

    @Autowired
    private LibCompo2 libCompo2;
    
    @Autowired
    private LibCompo3 libCompo3;
    
    @Autowired
    private Bean2 bean2;


    public void displayCompo1(){

        System.out.println("Compo1 with "+libBean1.getId()+", "+stringMyBeanFromLibConfig+", "+libCompoFromLibConfig.getId()+", "+libCompo2.getId()+", "+libCompo3.getId());
    }
}
