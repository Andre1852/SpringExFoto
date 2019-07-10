package com.am.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CodeCr javaCC = context.getBean("javaCodeCr", CodeCr.class);
        System.out.println(javaCC.getClassExample());

        CodeCr vbNetCC = context.getBean("vbNetCodeCr", CodeCr.class);
        System.out.println(vbNetCC.getClassExample());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
