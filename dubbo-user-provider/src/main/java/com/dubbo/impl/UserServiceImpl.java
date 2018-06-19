package com.dubbo.impl;

import javax.annotation.Resource;

import com.dubbo.api.UserService;
import com.dubbo.dao.UserDao;
import com.dubbo.utils.BeanConvertUtils;
import com.dubbo.vo.UserVo;

/**
 * 服务具体实现
 */
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public Integer insert(UserVo userVo) {
		return userDao.insert(BeanConvertUtils.vo2entity(userVo));
	}

	@Override
	public Integer update(UserVo userVo) {
		return userDao.update(BeanConvertUtils.vo2entity(userVo));
	}

	@Override
	public Integer delete(Integer userId) {
		return userDao.delete(userId);
	}

	@Override
	public UserVo getUserVoByUserId(Integer userId) {
		return BeanConvertUtils.entity2vo(userDao.getUserEntityByUserId(userId));
	}
	
}
