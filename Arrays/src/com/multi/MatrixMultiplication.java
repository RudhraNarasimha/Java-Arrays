package com.multi;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub

		Scanner scanner = new Scanner(System.in);

		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		int arr3[][] = new int[2][2];

		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[i].length - 1; j++) {
				System.out.println("Enter Values of " + i + " arr1 " + j);
				arr1[i][j] = scanner.nextInt();

			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i <= arr2.length - 1; i++) {
			for (int j = 0; j <= arr2[i].length - 1; j++) {
				System.out.println("Enter Values of " + i + " arr2: " + j);
				arr2[i][j] = scanner.nextInt();

			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i <= arr3.length - 1; i++) {
			for (int j = 0; j <= arr3[i].length - 1; j++) {
				arr3[i][j] += arr1[i][j] * arr2[j][i];
				System.out.print(arr3[i][j] + " ");
			}

			System.out.println(" ");
		}

	}
}
