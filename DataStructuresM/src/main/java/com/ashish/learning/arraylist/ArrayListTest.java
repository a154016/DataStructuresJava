package com.ashish.learning.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		List<String> vegetables=new LinkedList<String>();
		vegetables.add("Potatato");
		vegetables.add("carrot");
		fruits.add("Apple");
		fruits.add("pineapple");
		//fruits.add(1);
		fruits.add(1, "Grpes");
		fruits.addAll(vegetables);
		fruits.remove(1);
		fruits.removeAll(vegetables);
		//fruits.clear();
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.toArray());
		
		String[] x= new String[fruits.size()];
		fruits.toArray(x);
		for(String e:x)
		{
			System.out.println(e);
		}
		System.out.println(fruits);
	}

}
