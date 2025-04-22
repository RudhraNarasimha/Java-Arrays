package com.single;

import java.util.Scanner;

public class AvgOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the Array : ");

		int n = scanner.nextInt();

		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter the Values into Array : ");
		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();

			sum += arr[i];

		}
		int avg = sum / n;
		System.out.println("The Average of the Array is : " + avg);

	}

}
