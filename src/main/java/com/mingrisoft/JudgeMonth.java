package com.mingrisoft;

import java.util.Scanner;

/**
 * 判断用户输入月份的季节
 */
public class JudgeMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个月份，我能告诉你它属于那个季节");
		int month = scanner.nextInt();
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("您输入的月份是冬季！");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("您输入的月份是春季！");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("您输入的月份是夏季！");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("您输入的月份是秋季！");
				break;
		}
	}
}
