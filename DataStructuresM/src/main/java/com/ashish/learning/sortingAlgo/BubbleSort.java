package com.ashish.learning.sortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

//[15,16,6,8,5]
// idea is to compare each element with the next element and swap if it is incorrect order 
// so that sorted element reaches to the end 
//Optimization techniques can be involved 
// no of passes =inputArray.length-1-i
//if no swapping is done , means the array is sorted , break from the loop 
public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the elements to be sorted: comma separted format"+"\n");
		String inputString=scanner.nextLine();
		int data=0;
		
	
		String[] inputStringArray=inputString.split(",");
		int[] inputArray=new int[inputStringArray.length];
		for(int i=0;i<inputStringArray.length;i++)
		{
			inputArray[i]=Integer.valueOf(inputStringArray[i]);
		}
		
		System.out.println("Input array");
		System.out.println(Arrays.toString(inputArray));
		
		System.out.println("Select the kind of Sort you have to perform");
		System.out.println("1 :Bubble Sort"+"\n");
		System.out.println("2 :Linear Search ");
		System.out.println("3 :Binary Search::::Note The array should be sorted "+"\n");
		System.out.println("4 :Insertion Sort"+"\n");
		int kindSort=scanner.nextInt();
		switch(kindSort) {
		
		case (1):
		{
			int[] outputArray=bubbleSort(inputArray);
			System.out.println("Sorted array");
			System.out.println(Arrays.toString(outputArray));
		}
		case(2):
		{
			System.out.println("Enter the element to search"+"\n");
			data=scanner.nextInt();
			int location=linearSearch(inputArray, data);
			System.out.println("Location "+location);
		}
		
		case(3):
		{
			System.out.println("Enter the element to search"+"\n");
		data=scanner.nextInt();
		int location=binarySearch(inputArray, data);
		System.out.println("Location "+location);
			
		}
	case (4):
	{
		int[] outputArray=insertionSort(inputArray);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(outputArray));
	}
		}
	}

	

	static int[] bubbleSort(int[] inputArray) {

		// for the outer pass
		// executed n-1 times
		int flag = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = 0; j < inputArray.length - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {

					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
					flag++;

				}

			}
			if (flag == 0) {
				break;
			}
		}

		return inputArray;
	}
	
	static int linearSearch(int[] inputArray, int data)
	{
		
		int location=0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(data==inputArray[i])
			{
				//System.out.println("Element present at Location"+i+1);
				location=i+1;
				break;
			}
		
			else if(i==inputArray.length)
			{
				location=0;
			}
			else
			{
				//System.out.println("element Not Present");
				location=0;
			}
		}
		return location;
	}
	
	public static int binarySearch(int[] inputArray, int data)
	{
		int l=0;
		int r=inputArray.length-1;
		
				
		while(l<r)
		{
			int mid=l+r/2;
			if(data==inputArray[mid])
			{
				return mid;
			}
			
			else if(data<inputArray[mid])
			{
				//return mid;
				r=inputArray.length-2;
			}
			else if(data>inputArray[mid])
			{
				//return mid;
				l=mid+1;
			}
		}
		return -1;
	}
	
	public static int[] insertionSort(int[] inputArray)
	{
		for(int i=1;i<inputArray.length-1;i++)
		{
			int temp=inputArray[i];
			
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














