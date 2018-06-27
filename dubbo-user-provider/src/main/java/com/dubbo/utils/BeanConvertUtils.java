package com.dubbo.utils;

import java.util.ArrayList;
import java.util.List;

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
	
	/**
	 * 如果传进来的参数为null,返回为null
	 */
	public static List<UserEntity> vos2entities(List<UserVo> userVoList) {
		List<UserEntity> userEntityList = null;
		if (userVoList != null) {
			userEntityList = new ArrayList<UserEntity>();
			for (UserVo userVo: userVoList) {
				userEntityList.add(vo2entity(userVo));
			}
		}
		return userEntityList;
	}
	
	/**
	 * 如果传进来的参数为null,返回为null
	 */
	public static List<UserVo> entities2vos(List<UserEntity> userEntityList) {
		List<UserVo> userVoList = null;
		if (userEntityList != null) {
			userVoList = new ArrayList<UserVo>();
			for (UserEntity userEntity: userEntityList) {
				userVoList.add(entity2vo(userEntity));
			}
		}
		return userVoList;
	}
}
