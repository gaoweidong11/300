package com.mingrisoft;

/**
 * 用switch 语句根据消费金额计算折扣
 */
public class ProductPrice {
	public static void main(String[] args) {
		float money = 1170;
		String rebate = "";
		if (money > 200) {
			int grade = (int) (money/200);
			switch (grade) {
				case  1:
					rebate = "95折";
					break;
				case 2:
					rebate = "9折";
					break;
				case 3:
					rebate = "85折";
					break;
				case 4:
					rebate = "83折";
					break;
				case 5:
					rebate = "8折";
					break;
				case 6:
					rebate = "78折";
					break;
				case 7:
					rebate = "75折";
					break;
				case 8:
					rebate = "73折";
					break;
				case 9:
					rebate = "7折";
					break;
				case 10:
					rebate = "65折";
					break;
					default:
						rebate = "6折";
			}
		}
		System.out.println("您的累积消费金额为：" + money);
		System.out.println("您将享受"+rebate+"优惠！");
	}
}
