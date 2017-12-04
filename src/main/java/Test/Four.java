package Test;

import java.util.Scanner;

/**
 * 第四题：
 * 编写一个函数，可以判断一个整数是否为3位水仙花数，返回一个布尔值，是3位水仙花数则返回true，
 * 不是则返回false（如果不是3位数需要先输出"不是3位数"，然后再返回false，提示：153=1*1*1+5*5*5+3*3*3）
 */
public class Four {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数,且是3位数:");
		int a = scanner.nextInt();
		if (!(a > 100 && a < 1000)) {
			System.out.println("您输入的整数不是三位数");
		} else if (aBoolean(a)) {
			System.out.println("这个整数是水仙花数。");
		} else {
			System.out.println("这个整数不是水仙花数。");
		}
	}

	private static boolean aBoolean(int i) {
		boolean b = true;

		int baiwei = i / 100;
		int shiwei = (i / 10) % 10;
		int gewei = i % 10;

		if (baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei != i) {
			b = false;
		}

		return b;
	}

}
