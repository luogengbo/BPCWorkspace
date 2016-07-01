package com.weimi.bpc.service;

import com.weimi.bpc.entity.UserBean;

public interface UserService {
	
	public UserBean getUserByName(String name);
	
	public int insertUser(UserBean user);

}
