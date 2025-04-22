package com.single;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter Index number " + i);
			arr[i] = scanner.nextInt();

		}

		for (int i = 0; i <= arr.length - 1; i++) {
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
