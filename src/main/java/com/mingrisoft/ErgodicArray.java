package com.mingrisoft;

/**
 * 使用while 循环语句与自增运算符循环遍历数组
 */
public class ErgodicArray {
	public static void main(String[] args) {
		String[] aves = new String[]{"白鹭","黄鹂","鹦鹉","乌鸦","喜鹊","布谷鸟","斑鸠","百灵鸟","火炎焱","雀儿"};
		int index = 0;
		System.out.println("我的花园里有很多鸟，大约包括：");
		while (index < aves.length) {
			System.out.println(aves[index++]);
		}
	}
}
