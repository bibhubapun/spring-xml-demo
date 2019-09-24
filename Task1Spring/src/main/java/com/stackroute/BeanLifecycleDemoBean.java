package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("initialised");
    }
    public void customDelete(){
        System.out.println("Custom delete");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }
}
