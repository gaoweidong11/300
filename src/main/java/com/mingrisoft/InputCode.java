package com.mingrisoft;

import java.util.Scanner;

/**
 * 从控制台接受输入字符
 */
public class InputCode {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); //创建输入流扫描器
		System.out.println("请输出您的身份证号：");//提示用户输入
		String line = scanner.nextLine();			//获取用户输入的一行文本
		//打印对输入文本的描述
		System.out.println("原来您的身份证号是"+line.length()+"位数字啊！");
	}
}
