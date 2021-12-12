package com.ashish.learning.sortingAlgo;

import java.util.Arrays;

//divided into sorted sublist and unsorted sublist
//take one variable from unsorted sublist and place in sorted sublist 
//find appropriate place for that value in sorted sublist one by one

public class InsertionSort {
	
	
	public static void main(String[] args) {
		
		int[] inputArray=new int[] {15,16,0,7,99};
		System.out.println(Arrays.toString(insertionSort(inputArray)));
	}

	
	static int[] insertionSort(int[] inputArray)
	{
		int temp=0;
		for(int i=1;i<inputArray.length;i++)

		{
			temp=inputArray[i];
			int j=i-1;
			
			while(j>=0&&inputArray[j]>temp)
			{
				inputArray[j+1]=inputArray[j];
				j--;
			}
			inputArray[j+1]=temp;
		}
		return inputArray;
	}
}
