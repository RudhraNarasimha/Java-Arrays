package com.single;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[] { 10, 20, 30, 40, 50 };

		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// reverse array

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
