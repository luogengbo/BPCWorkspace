package com.weimi.bpc.dao;

import com.weimi.bpc.entity.UserBean;

public interface UserDao {
	public UserBean getUserByName(String name);
	
	public int insertUser(UserBean user);

}
