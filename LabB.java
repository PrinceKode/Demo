package com.prince;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LabB {
    public static void main(String[] args) {

        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("Spring container Start==");

        A aobj = (A) ctx.getBean("createA");
        System.out.println(aobj);

        B bobj = (B) ctx.getBean("createB");
        System.out.println(bobj);

        Hello h = (Hello) ctx.getBean("createHello");
        h.show();
    }
}