package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args ) throws Exception {
//        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie=context.getBean("movie",Movie.class);
//        movie.display();
//        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
//        BeanLifecycleDemoBean bean=context1.getBean("beanLifecycle",BeanLifecycleDemoBean.class);
//        bean.afterPropertiesSet();
//        bean.destroy();
        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        BeanPostProcessorDemoBean bean=context1.getBean("beanPostProcess",BeanPostProcessorDemoBean.class);
        bean.postProcessAfterInitialization(context1,"abc");
        bean.postProcessBeforeInitialization(context1,"abc");




    }
}
