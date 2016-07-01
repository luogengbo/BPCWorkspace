package com.weimi.bpc.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.weimi.bpc.dao.UserDao;
import com.weimi.bpc.entity.UserBean;

@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public UserBean getUserByName(String name) {
        // select��䣬����һ������������User����  -------------------------------------------------------------------------    
		return getSqlSession().selectOne("UserMapper.getUserByName", "Jon");// select��䣬����һ������������User����    
	}
	
	@Override
	public int insertUser(UserBean user) {
        return getSqlSession().insert("UserMapper.insertUser",user);//insert��䣬����һ������    
	}

}
