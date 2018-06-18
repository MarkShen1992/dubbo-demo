package com.dubbo.impl;

import com.dubbo.api.UserService;

/**
 * 服务具体实现
 */
public class UserServiceImpl implements UserService {

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
