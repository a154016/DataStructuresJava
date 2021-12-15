package com.java.datastructure.linkedlist;

public class LinkedList {
	
	public Node head;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.setData(data);
		node.setNext(null);
		
	if(head==null) {
		head=node;
	}
		else 
		{
			Node n =head;
			while(n.getNext()!=null)
			{
				n.setNext(node.getNext());
			}
			
			node.setNext(n.getNext());
		}
	}
	
	public void show() {
		Node node=head;
		while (node.getNext()!=null)
		{
			
			System.out.println("Data"+node.getData());
		}
		node=node.getNext();
		//System.out.println("Data"+node.getData());
	}

}
