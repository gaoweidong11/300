package com.mingrisoft;

/**
 * 过滤"老鹰" 字符串
 */
public class CycFilter {

	public static void main(String[] args) {
		String[] array = new String[]{"白鹭", "孔雀", "丹顶鹤", "瞩目鸟", "喜鹊", "老鹰", "百灵鸟", "老鹰", "鹦鹉", "老鹰"};
		System.out.println("在我的花园里有很多的鸟类，但是最近来了很多老鹰，请帮我抓走它们");
		int eagleCount = 0;
		for (String string : array) {
			if (string.equals("老鹰")) {
				System.out.println("发现一只老鹰，已经抓到笼子里");
				eagleCount++;
				continue;
			}
			System.out.println("搜索鸟类，发现了："+string);
		}
		System.out.println("一共捉到了："+eagleCount+"只老鹰！");
	}
}
