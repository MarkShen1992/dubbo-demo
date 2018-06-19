package com.dubbo.api;

import com.dubbo.vo.UserVo;

/**
 * 定义服务接口
 *
 */
public interface UserService {
	
	String sayHello(String name);
	
	Integer insert(UserVo userVo);
	
	Integer update(UserVo UserVo);
	
	Integer delete(Long userId);
	
	UserVo getUserVoByUserId(Long userId);
}
