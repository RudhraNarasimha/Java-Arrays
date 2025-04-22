package com.search;

public class LinearSearch {
	public static int search(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 17, -23, 96, 14, -63, 78, -11, 13 };

		int index = search(arr, -11);
		
		if (index != -1) {
			System.out.println("Element Found at index : " + index);
		} else {
			System.out.println("Given Elemen is not Found");
		}
	}

}
