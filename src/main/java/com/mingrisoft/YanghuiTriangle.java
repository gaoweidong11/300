package com.mingrisoft;

/**
 * 使用for循环输出杨辉三角形
 */
public class YanghuiTriangle {
	public static void main(String[] args) {
		int triangle[][] = new int[10][];//创建二维数组
		//遍历二维数组的第一层
		for (int i = 0 ; i<triangle.length;i++) {
			triangle[i] = new int[i + 1];
			//遍历第二层数组
			for (int j = 0 ; j<i;j++) {
				if (j == 0) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
