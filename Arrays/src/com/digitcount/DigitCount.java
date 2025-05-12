package com.digitcount;

import java.util.Scanner;

public class DigitCount {

	private static void printUniqueDigitsCount(int number) {

		int digit[] = new int[10];
		while (number > 0) {
			int rem = number % 10;
			digit[rem]++;
			number = number / 10;
		}
		int count = 0;
		for (int i = 0; i < digit.length; i++) {
			if (digit[i] > 0) {
				count++;
			}

		}
		System.out.println("Number of UniqueDigits" + count);
	}

	private static void printNonRepeatedDigitsCount(int number) {
		// TODO Auto-generated method stub
		int digit[] = new int[10];
		while (number > 0) {
			int rem = number % 10;
			digit[rem]++;
			number = number / 10;
		}
		int count = 0;
		for (int i = 0; i < digit.length; i++) {
			if (digit[i] == 1) {
				count++;
			}

		}
		System.out.println("Number of NonRepeatedDigits" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");

		int number = scanner.nextInt();

		printUniqueDigitsCount(number);
		printNonRepeatedDigitsCount(number);

	}

}
