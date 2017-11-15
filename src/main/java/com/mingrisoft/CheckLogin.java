package com.mingrisoft;

import java.util.Scanner;

/**
 * 输入合法登录信息的效果
 */
public class CheckLogin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入登录用户名：");
		String username = scanner.nextLine();
		System.out.println("请输入登录密码：");
		String password = scanner.nextLine();
		if (!username.equals("mr")) {
			System.out.println("用户名非法！");
		} else if (!password.equals("mrsoft")){
			System.out.println("登录密码错误。");
		}else {
			System.out.println("恭喜你，登录信息通过验证。");
		}

	}
}
