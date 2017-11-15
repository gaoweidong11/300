package com.mingrisoft;

import java.util.Scanner;

/**
 * 为新员工分配部门
 */
public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入新员工的姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入新员工应聘的编程语言：");
		String language = scanner.nextLine();
		switch (language.hashCode()) {
			case 3254818://java的哈希表
			case 2301506://Java的哈希表
			case 2269730://JAVA的哈希表
				System.out.println("员工"+name+"被分配到java程序开发部门");
				break;
			case 3104://c#的哈希表
			case 2112://C#的哈希表
				System.out.println("员工"+name+"被分配到c#程序开发部门");
				break;
			case -709190099://asp.net的哈希表
			case 955463181://Asp.net的哈希表
			case 9745901://ASP.NET的哈希表
				System.out.println("员工"+name+"被分配到ASP.net程序开发部门");
				break;
				default:
					System.out.println("本公司不需要"+language+"语言的程序开发人员");
		}
	}
}
