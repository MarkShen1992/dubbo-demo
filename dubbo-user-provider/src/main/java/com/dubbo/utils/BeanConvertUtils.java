package com.dubbo.utils;

import org.springframework.beans.BeanUtils;

import com.dubbo.entity.UserEntity;
import com.dubbo.vo.UserVo;

/**
 * 实体类转换工具类
 * @author MarkShen
 * @since 2018/6/19
 */
public class BeanConvertUtils {
	
	public static UserEntity vo2entity(UserVo userVo) {
		if (userVo == null) {
			return null;
		}
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userVo, userEntity);
		return userEntity;
	}
	
	public static UserVo entity2vo(UserEntity userEntity) {
		if (userEntity == null) {
			return null;
		}
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(userEntity, userVo);
		return userVo;
	}
}
