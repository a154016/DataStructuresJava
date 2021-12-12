package com.ashish.learning.sortingAlgo;

import java.util.Arrays;

public class BinarySearch {

	// Array should be sorted
	// Works in Divide andConquer technique
	// find the mid value and search whether data is to theh left or to the right
	// acoording iterate in the subarray
	
	//reducing search space by half 
	//timecomplexity o(logn)
	//bestO(1)
	//worst O(logn)
	public static void main(String[] args) {

		
		//int[] inputArray=new int[] {1,2,3,4,5};
		
		int[] inputArray =new int[] {15,21,7,1,0,99};
		System.out.println(Arrays.toString(bubbleSort(inputArray)));
	//System.out.println( binarySearch(inputArray, 4));

		
	}

	static int binarySearch(int[] inputArray, int data) {
		int l = 0;
		int r = inputArray.length - 1;
		

		while (l <r) {
			int mid = (l + r) / 2;
			if (data == inputArray[mid])
				return mid;
			else if (data < inputArray[mid]) {
				r = mid - 1;
			} else if (data > inputArray[mid]) {
				l = mid + 1;
			}
		}

		return -1;
	}
	
	static int[] bubbleSort(int[] inputArray)
	{
		for(int i=0;i<inputArray.length-1;i++)
		{
			for(int j=0;j<inputArray.length-1;j++)
			{
				if(inputArray[j]>inputArray[j+1])
				{
					int temp=inputArray[j];
					inputArray[j]=inputArray[j+1];
					inputArray[j+1]=temp;
					
				}
			}
		}
		
		
		
		return inputArray;
	}

}
