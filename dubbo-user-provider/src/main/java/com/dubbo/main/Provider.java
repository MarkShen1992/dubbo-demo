package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Provider
 * 
 * @author 18009
 *
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/provider.xml", "spring/spring-dao.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
