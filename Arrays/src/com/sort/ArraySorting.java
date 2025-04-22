package com.sort;

public class ArraySorting {

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 10, -23, 44, 1, -7, 9, -11 };
		sort(arr);

		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int arr1[] = { 7, 10, -23, 44, 1, -7, 9, -11 };
		sort(arr1);

		System.out.println("After Sorting");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
