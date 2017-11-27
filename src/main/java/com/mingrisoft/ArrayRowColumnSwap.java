package com.mingrisoft;


/**
 * 将二维数组中的行列互换
 */
public class ArrayRowColumnSwap {
	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("行列互换前：");
		//输出二维数组
		printArray(arr);
		int arr2[][] = new int[arr.length][arr.length];
		for (int i = 0; i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("行列互调后：");
		//输出行列互调后的二维数组
		printArray(arr2);
	}

	private static void printArray(int[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
