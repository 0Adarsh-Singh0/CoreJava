package com.oracle.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		/*
		 * HashSet --> never permits duplicates
		 *         --> elements are unordered
		 *         --> no guaranty of order
		 * */
		HashSet<String> set1=new HashSet<>();
		set1.add("Dosa");
		boolean b1=set1.add("Samosa");//returns true
		set1.add("Vada");
		set1.add("Parotta");
		boolean b2=set1.add("Samosa");//returns false
		System.out.println(set1);
		System.out.println(b1+"  "+b2);
		/*
		 * TreeSet  --> never permits duplicates
		 *          --> uses RedBlack B T
		 *          --> by default its sorted
		 * */
		TreeSet<String> set2=new TreeSet<>();
		set2.add("Dosa");
		 b1=set2.add("Samosa");//returns true
		 set2.add("Vada");
		 set2.add("Parotta");
		 b2=set2.add("Samosa");//returns false
		 set2.add("Banana");
		 set2.add("Alu Parotta");
		System.out.println(set2);
		System.out.println(b1+"  "+b2);
		/*
		 * LinkedHashSet -->never permits duplicates
		 *               -->elements arranged in insertion order
		 * */
		LinkedHashSet<String> set3=new LinkedHashSet<>();
		set3.add("Dosa");
		 b1=set3.add("Samosa");//returns true
		 set3.add("Vada");
		 set3.add("Parotta");
		 b2=set3.add("Samosa");//returns false
		 set3.add("Banana");
		 set3.add("Alu Parotta");
		System.out.println(set3);
		System.out.println(b1+"  "+b2);
	}
}