package com.xuyu.service.impl;

import com.xuyu.service.UserService;

public class UserServiceImpl implements UserService{

	//spring? aop来实现
	//每个UserService都要手动写 代码重复
	public void add() {
		//System.out.println("开启事务");
		System.out.println("查数据库");
		//System.out.println("结束事务");
	}

}
