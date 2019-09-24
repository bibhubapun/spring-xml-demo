package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1=factory.getBean("movie",Movie.class);
        movie1.display();

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=context.getBean("movie",Movie.class);
        movie2.display();

       /* BeanDefinitionReader reader=new XmlBeanDefinitionReader();
       reader.getResourceLoader();*/


    }
}
