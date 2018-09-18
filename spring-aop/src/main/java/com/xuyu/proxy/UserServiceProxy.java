package com.xuyu.proxy;

import com.xuyu.service.UserService;
//静态代理设计模式
public class UserServiceProxy {

	private UserService userService;
	public UserServiceProxy(UserService userService) {
		this.userService=userService;
	}
	public void add() {
		//开启事务
		System.out.println("静态代理开启事务");
		userService.add();
		//提交事务
		System.out.println("静态代理结束事务");
	}
}
