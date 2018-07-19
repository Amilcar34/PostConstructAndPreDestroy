package com.test.PostConstruct_PreDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Mascota;
import com.test.entities.PostConstructAndPreDestroyByAnnotation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/xml/beans.xml");
        
        applicationContext.getBean(PostConstructAndPreDestroyByAnnotation.class);
        Mascota m = (Mascota) applicationContext.getBean("test");

        System.out.println(m.getName());
        System.out.println(m.getDueño().getName());
        ((ConfigurableApplicationContext) applicationContext).close();
    }
    
    
}
