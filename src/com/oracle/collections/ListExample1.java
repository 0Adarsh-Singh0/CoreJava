package com.oracle.collections;

import java.util.*;

public class ListExample1 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		System.out.println("Capacity is "+v1.capacity());
		
		Vector<String> v2 = new Vector<>(5);
		System.out.println("Capacity is "+v2.capacity());

		v2.add("Banglore");
		v2.add("Mysore");
		v2.add("Mumbai");
		v2.add("Chennai");
		
		System.out.println("no of elements is "+v2.size());
		System.out.println(v2);
		
		v2.add("Pune");
		v2.add("Delhi");
		
		System.out.println(v2);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("ArrayList Added");
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("LinkedList Added");
		System.out.println(list2);
		

		
	}

}
