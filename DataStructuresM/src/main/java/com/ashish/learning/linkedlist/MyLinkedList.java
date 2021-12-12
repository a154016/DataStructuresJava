package com.ashish.learning.linkedlist;

public class MyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public  Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void add(int data)
	{
		Node toAdd=new Node(data);
		if(isEmpty()) {
			head=toAdd;
			return;
			//returns  the execution from the parent function no further processing
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}

	
	 boolean isEmpty()
	 {
		 return head==null;
	 }
	 
	 void print()
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
	 }
}
