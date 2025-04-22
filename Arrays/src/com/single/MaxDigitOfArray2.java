package com.single;

import java.util.Scanner;

public class MaxDigitOfArray2 {

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
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {

				max = arr[i];

			}

		}
		System.out.println("Maximum Element of Array is " + max);

		int secondMax = Integer.MIN_VALUE; // Smallest possible number

		for (int i = 0; i < n; i++) {
			if (arr[i] != max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}

		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("No second maximum found (all elements are same or only one element).");
		} else {
			System.out.println("Second Maximum Element is " + secondMax);

		}

	}
}
