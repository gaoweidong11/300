package Test;

import java.util.Scanner;

/**
 * 第七题：Q007：
 * 编写一个函数sum，调用时需要提供一个整数，最终返回从1到这个数之间所有整数的和
 * 代码示例：
 * int a = sum(3);
 * 得到a的值为6，因为1+2+3=6
 * int b = sum(5);
 * 得到b的值为15，因为1+2+3+4+5=15
 */
public class Seven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = scanner.nextInt();
		int i = sum(a);
		System.out.println("从1到" + a + "之间所有的整数的和是：" + i);
	}

	private static int sum(int i) {

		return (i + 1) * i / 2;
	}
}
