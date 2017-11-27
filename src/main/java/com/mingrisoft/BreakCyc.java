package com.mingrisoft;

/**
 * 终止循环体    关键字 break  打破；折断；弄坏；削弱
 */
public class BreakCyc {

	public static void main(String[] args) {
		String[] array = new String[]{"白鹭","孔雀","丹顶鹤","瞩目鸟","喜鹊","老鹰","百灵鸟","蜂鸟","鹦鹉","布谷鸟"};
		System.out.println("在你发现第一个老鹰的时候，告诉我前边的鸟:");
		for (String string : array) {
			if (string.equals("老鹰")) {
					break;
			}
			System.out.println("有：" + string + "      ");
		}

	}
}
