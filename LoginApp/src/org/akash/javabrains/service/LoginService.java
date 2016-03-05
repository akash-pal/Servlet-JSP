package org.akash.javabrains.service;

import java.util.HashMap;

import org.akash.javabrains.dto.User;


public class LoginService{
	
	HashMap<String, String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("1", "akash");
		users.put("2", "avi");
		users.put("3", "ria");
	}
	
	/*
	  Business service-authenticate()
	  Model- boolean 
	*/
     public boolean authenticate(String userId, String password){
    	 if(password == null || password.trim() == ""){
    		 return false;
    	 }
    	 return true;
     }
     /*
	  Business service-getUserDetails()
	  Model- User
	*/
     public User getUserDetails(String userId){
    	 User user = new User();
    	 user.setUserId(userId);
    	 user.setUserName(users.get(userId));
    	 return user;
     }
}
