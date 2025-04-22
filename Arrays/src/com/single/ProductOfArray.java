package com.single;

import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the Array : ");

		int n = scanner.nextInt();

		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Values into Array : ");

			arr[i] = scanner.nextInt();

			sum += arr[i];

		}

		System.out.println("The Sum of the Array is : " + sum);

	}

}
