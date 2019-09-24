package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie beanA=context.getBean("movieA",Movie.class);
        Movie beanB=context.getBean("movieB",Movie.class);
        System.out.println(beanA==beanB);

       /* BeanDefinitionReader reader=new XmlBeanDefinitionReader();
       reader.getResourceLoader();*/


    }
}
