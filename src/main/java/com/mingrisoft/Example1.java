package com.mingrisoft;

import java.util.Scanner;

/**
 * 不用乘法运算符实现2*16
 */
public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出一个整数");
		long number = scanner.nextLong();
		System.out.println("您输入的数字是：" + number);
		System.out.println("该数字乘以2的运算结构为："+(number<<1));
		System.out.println("该数字乘以4的运算结构为："+(number<<2));
		System.out.println("该数字乘以8的运算结构为："+(number<<3));
		System.out.println("该数字乘以16的运算结构为："+(number<<4));
	}
}
