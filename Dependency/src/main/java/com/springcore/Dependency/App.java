package com.springcore.Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Student st = context.getBean("subject",Student.class);
        System.out.println(st.study());
        
    }
}
