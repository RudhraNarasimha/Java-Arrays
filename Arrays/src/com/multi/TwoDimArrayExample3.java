package com.multi;

import java.util.Scanner;

public class TwoDimArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int arr[][] = new int[3][4];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("Enter Value at " + i + ":" + j);
				arr[i][j] = scanner.nextInt();

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.print(arr[i][j] +" ");

			}
			
			System.out.println();
		}
	}
}
