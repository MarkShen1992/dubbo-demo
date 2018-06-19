package com.dubbo.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.dubbo.api.UserService;
import com.dubbo.dao.UserDao;
import com.dubbo.entity.UserEntity;
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
		return userDao.insert(vo2entity(userVo));
	}

	@Override
	public Integer update(UserVo userVo) {
		return userDao.update(vo2entity(userVo));
	}

	@Override
	public Integer delete(Integer userId) {
		return userDao.delete(userId);
	}

	@Override
	public UserVo getUserVoByUserId(Integer userId) {
		return entity2vo(userDao.getUserEntityByUserId(userId));
	}
	
	private UserEntity vo2entity(UserVo userVo) {
		if (userVo == null) {
			return null;
		}
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userVo, userEntity);
		return userEntity;
	}
	
	private UserVo entity2vo(UserEntity userEntity) {
		if (userEntity == null) {
			return null;
		}
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(userEntity, userVo);
		return userVo;
	}
	
}
