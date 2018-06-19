package com.dubbo.dao;

import org.apache.ibatis.annotations.Param;

import com.dubbo.entity.UserEntity;

/**
 * Dao层接口的实现
 * @since 2018/6/19
 * @author MarkShen
 */
public interface UserDao {

	/**
	 * 添加用户
	 * @param userEntity
	 * @return
	 */
	Integer insert(UserEntity userEntity);

	/**
	 * 修改用户
	 * @param userEntity
	 * @return
	 */
	Integer update(UserEntity userEntity);

	/**
	 * 根据用户id删除用户
	 * @param userId
	 * @return
	 */
	Integer delete(@Param("userId") Long userId);

	/**
	 * 根据用户id查找用户对象
	 * @param userId
	 * @return
	 */
	UserEntity getUserEntityByUserId(@Param("userId") Long userId);
}