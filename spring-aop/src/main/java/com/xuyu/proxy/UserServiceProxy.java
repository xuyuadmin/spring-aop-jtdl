package com.xuyu.proxy;

import com.xuyu.service.UserService;
//��̬�������ģʽ
public class UserServiceProxy {

	private UserService userService;
	public UserServiceProxy(UserService userService) {
		this.userService=userService;
	}
	public void add() {
		//��������
		System.out.println("��̬����������");
		userService.add();
		//�ύ����
		System.out.println("��̬�����������");
	}
}
