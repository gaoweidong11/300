package Test;

import java.util.Scanner;

/**
 * 第六题：Q006：
 * 编写一个函数，调用时需要提供一个整数n，n代表考试成绩，
 * 成绩低于60分则返回"不及格",
 * 60-69返回"及格"，
 * 90-100返回"优"
 * 80-89返回"良",
 * 70-79返回"中"
 * 如果n小于0则返回"成绩最小值为1"，
 * 如果n大于100则返回"成绩最大值为100"，
 * 测试用例：fun(-8);fun(36);fun(87);fun(92);fun(65);
 */
public class Six {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的成绩！");
		int i = scanner.nextInt();
		String f = fun(i);
		System.out.println("您的成绩等级是："+f);
	}

	private static String fun(int n) {
		String s = "";
		if (n < 0) {
			s = "成绩最小值为1";
		} else if (n > 100) {
			s = "成绩最大值为100";
		} else if (n < 60) {
			s = "不及格！";
		} else if (n > 60 && n < 70) {
			s = "及格";
		} else if (n > 90 && n < 100) {
			s = "优";
		} else if (n > 80 && n < 90) {
			s = "良";
		} else if (n > 70 && n < 80) {
			s = "中";
		}
		return s;
	}
}
