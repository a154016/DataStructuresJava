package com.ashish.learning.linkedlist;

public class StackImplementation {
	
	private int array[];
	private int capacity;
	private int top;
	
	StackImplementation(int capacity)
	{
		this.array=new int[capacity];
		this.capacity=capacity;
		this.top=-1;
	}

	
	public void push(int item)
	{
		if (top==capacity-1)
		{
			System.out.println("Stack is Full");
		}
		else if(top<capacity)
		{
			top=top+1;
			array[top]=item;
		}
	}
	
	public int  pop()
	{
		int item=0;
		if (top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
		 item= array[top];
			top=top-1;
			
		}
        return item;
	}                
	
	public int peek()
	{
		return array[top];
	}
}
