package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();
       /* BeanDefinitionReader reader=new XmlBeanDefinitionReader();
       reader.getResourceLoader();*/


    }
}
