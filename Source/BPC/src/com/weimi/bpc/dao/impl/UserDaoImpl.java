package com.weimi.bpc.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.weimi.bpc.dao.UserDao;
import com.weimi.bpc.entity.UserBean;

@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public UserBean getUserByName(String name) {
        // select语句，传入一个参数，返回User对象  -------------------------------------------------------------------------    
		return getSqlSession().selectOne("UserMapper.getUserByName", "Jon");// select语句，传入一个参数，返回User对象    
	}
	
	@Override
	public int insertUser(UserBean user) {
        return getSqlSession().insert("UserMapper.insertUser",user);//insert语句，传入一个对象    
	}

}
