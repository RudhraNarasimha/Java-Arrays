package com.multi;

import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int arr[][] = new int[5][];

		arr[0] = new int[] { 1, 2, 3, 4, 5 };
		arr[1] = new int[] { 1, 2, 3, 4 };
		arr[2] = new int[] { 1, 2, 3 };
		arr[3] = new int[] { 1, 2 };
		arr[4] = new int[] { 1 };

//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.println("Enter Value at " + i + ":" + j);
//				arr[i][j] = scanner.nextInt();
//
//			}
//			System.out.println();
//		}
//
//		System.out.println();

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");

			}

			System.out.println(" ");
		}
	}
}
