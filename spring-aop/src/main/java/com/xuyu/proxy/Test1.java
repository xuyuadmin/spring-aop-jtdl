package com.xuyu.proxy;

import com.xuyu.service.impl.UserServiceImpl;

public class Test1 {

	public static void main(String[] args) {
		//UserService userService=new UserServiceImpl();
		UserServiceProxy userServiceProxy=new UserServiceProxy(new UserServiceImpl());
		userServiceProxy.add();
	}
}
