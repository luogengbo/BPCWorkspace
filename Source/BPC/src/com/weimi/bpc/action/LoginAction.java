package com.weimi.bpc.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.weimi.bpc.entity.UserBean;
import com.weimi.bpc.service.UserService;

public class LoginAction extends BaseAction {
	/**   
     *    
     */    
    private static final long serialVersionUID = -6144396976094110475L; 
    
    private UserBean user;    
    
    private String username;
    
    private String password;
    
    private UserService userService;
        
    public String loginHome() throws Exception     
    {    
    	user = userService.getUserByName(username);    
        System.out.println(user.getName()); 
        return SUCCESS;
    }
    
    public String loginOther() throws Exception     
    {      
        return SUCCESS;      
    }

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
