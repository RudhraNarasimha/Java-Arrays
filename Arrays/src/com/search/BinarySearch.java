package com.search;

public class BinarySearch {

	public static int search(int arr[], int element, int first, int last) {

		int mid = (first + last) / 2;

		if (mid > last) {

			return -1;
		} else {

			if (element == arr[mid]) {
				return mid;
			} else {
				if (element > arr[mid]) {
					return search(arr, element, mid + 1, last);
				} else {
					return search(arr, element, first, mid - 1);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 7, 9, 17, 19, 27, 111, 222 };

		int index = search(arr, 111, 0, arr.length - 1);

		if (index != -1) {
			System.out.println("Element Found at index : " + index);
		} else {
			System.out.println("Given Element is not Found");
		}
	}

}
