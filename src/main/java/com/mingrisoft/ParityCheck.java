package com.mingrisoft;

import java.util.Scanner;

/**
 * 三元运算符判断奇数和偶数
 */
public class ParityCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		long number = scanner.nextLong();
		String check = (number % 2 == 0) ? "这个数是：偶数" : "这个数数：奇数";
		System.out.println(check);
	}

}
