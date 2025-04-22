package com.sort;

public class RemoveDuplicates {

	private static void removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub

		int temp[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isNotExist = true;
			for (int j = 0; j < temp.length; j++) {
				if (arr[i] == temp[j]) {

					isNotExist = false;
					break;

				}

			}

			if (isNotExist) {
				temp[index++] = arr[i];
			}

		}
		int fArr[] = new int[index];
		for (int i = 0; i < fArr.length; i++) {
			fArr[i] = temp[i];
		}

		System.out.println("After removing Duplicates");

		for (int i = 0; i < fArr.length; i++) {

			System.out.print(fArr[i] + " ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 11, -14, 55, -7, 11, 55, -14, 25, 63, 96, 25, 96 };

		removeDuplicates(arr);

	}

}
