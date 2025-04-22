package com.single;

import java.util.Scanner;

public class MinDigitOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Size of the Array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the Values into the Array");
		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();

		}
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println("Minimum Element of Array is " + min);

		int secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] != min && arr[i] < secondMin) {
				secondMin = arr[i];
			}
		}

		if (secondMin == Integer.MAX_VALUE) {
			System.out.println("No second minimum found (all elements are same or only one element).");
		} else {
			System.out.println("Second Minimum Element of Array is " + secondMin);
		}

	}
}
