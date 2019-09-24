package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private Actor actor;

   /* public Movie(Actor actor) {
        this.actor = actor;
    }*/

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println("Name: "+actor.getName()+" Gender:"+actor.getGender()+" age:"+actor.getAge());
    }

    @Override
    public void setBeanName(String s) {
        //System.out.println(s);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
