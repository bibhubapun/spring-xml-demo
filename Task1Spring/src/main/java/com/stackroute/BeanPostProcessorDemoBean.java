package com.stackroute;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("PP after init");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("PP before init");
        return bean;
    }
}
