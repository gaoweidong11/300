package com.mingrisoft;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * 不借助第三个变量实现两个变量互换
 */
public class VariableExchange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入变量A 的值");
		long A = scanner.nextLong();
		System.out.println("请输入变量B 的值");
		long B = scanner.nextLong();
		System.out.println("A=" + A + "\tB=" + B);
		System.out.println("执行变量互换...");
		A = A ^ B;
		B = B ^ A;
		A = A ^ B;
		System.out.println("A=" + A + "\tB=" + B);
	}
}
