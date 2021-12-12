package com.ashish.learning.searchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {

		int[] intArray = new int[] { 15, 5, 20, 35, 2, 42, 67, 17 };
		// isPresent(intArray, 42);
		isPresent(intArray, 41);

	}

	static void isPresent(int[] array, int data) {
		boolean isPresent = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				System.out.println("Element found at index::" + i);
				isPresent = true;
				return;// execution will go out from current loop
			}

		}
		if (isPresent == false) {
			System.out.println("Data not found");
		}

	}
}
//Time Complexity : Best Case : 1 o(1)
//Worst case : N comparisons o(n)
//Average Case : 1+2+3 +...n\n= n(n+2)/2