package com.weimi.bpc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.weimi.bpc.dao.UserDao;
import com.weimi.bpc.entity.UserBean;
import com.weimi.bpc.service.UserService;

public class UserServiceImpl implements UserService {
	
	//private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired    
    private UserDao userDao;

	@Override
	public UserBean getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}

	@Override
	public int insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
