package com.ashish.arrays;

import java.util.Scanner;

/* 
 * Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

 */
public class ArrayDemo {
	
	
	static Integer[] inputArray=new Integer[10];
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter elements of the arrays to reverse");
		for(int i=0;i<5;i++ )
		{
			inputArray[i]=scanner.nextInt();
		}
		System.out.println(inputArray);
		/*
		 * for(int j=4;j>=0;j--) { System.out.print(inputArray[j]); }
		 */
		findMax(inputArray);
	}
	
	public static void findMax(Integer[] inputArray)
	{
		int max;
		for(int i=0;i<inputArray.length;i++)
		{
		
				if(inputArray[i]>inputArray[i+1])
				{
					max=inputArray[i];
				
			}
		}
		System.out.println("maximum+max");
	}

}
