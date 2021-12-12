package com.ashish.learning.sortingAlgo;

import java.util.Scanner;

import javax.naming.PartialResultException;
// Take the number of inputs 
// input the array from the user 
// ask the sorting technique to apply 
// print the result using the sorting technique 
//estimate the performance with that technique using tim e
public class QuickSortDemo {
	static Scanner scanner=new Scanner(System.in);
	static int[] inputArray;
	static int[] sortedArray;
	public static void main(String[] args) {
		
		
		System.out.println("**************Welcome to the Sorting and Sorting Algorithm Program************");
        System.out.println("Enter the Elements to be sorted");
        inputUserArrayToSort();
        System.out.println("Enter the sorting technique");
        String technique=scanner.nextLine();
        if(technique.equals("Quick Sort"))
        {
        	sortedArray=quickSort(inputArray);
        }
        
        
	}

	private static int[] quickSort(int[] inputArray) {
		int lb;
		int ub;
		lb=0;
		ub=inputArray.length;
		partition(inputArray, lb, ub)
		return inputArray;
		
		
	}
	
	public static int partition(int[] inputArray, int lb, int ub)
	{
		int pivot;
		int start;
		int end;
		pivot=inputArray[lb];
		start=lb;
		end=ub;
		
		while(inputArray[start]<pivot)
		{
			start++;
		}
		while (inputArray[end]>pivot)
		{
			end--;
		}
		
		if(start<end )
		{
			swap(inputArray[start],inputArray[end]);
		}
	}

	private static void swap(int i, int j) {
		
		int temp;
		temp=inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]=temp;
		//RunTimeException t;
		
	}

	public static int[] inputUserArrayToSort() {
		

		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			inputArray[i] = scanner.nextInt();
		}
		return inputArray;

	}

	

}
