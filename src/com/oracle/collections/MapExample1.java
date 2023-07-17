package com.oracle.collections;

import java.util.HashMap;

public class MapExample1 {
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("E-101", "Harsha");
		map1.put("E-102", "Arjun");
		map1.put("E-103", "Anusha");
		map1.put("E-104", "Karthick");
		map1.put("E-105", "Aishwarya");
		
		System.out.println(map1);
		
		String name = map1.get("E-101");
		System.out.println(name);
	}
}
