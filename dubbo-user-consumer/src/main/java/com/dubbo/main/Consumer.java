package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.api.UserService;


public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		new String[] {"spring/consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
		String hello = userService.sayHello("world"); // 执行远程方法
		System.out.println(hello); // 显示调用结果
    }
}