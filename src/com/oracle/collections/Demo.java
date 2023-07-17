package com.oracle.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {
	static HashMap<String,ArrayList<Integer>> directory = new HashMap<String,ArrayList<Integer>>();
	public static void addNumber(String name,int mobNo){
		ArrayList<Integer> numberList = directory.get(name);
		if(directory.containsKey(name))
		{
			if(!numberList.contains(mobNo))
				numberList.add(mobNo);
		}
		else{
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				if(!tempList.contains(mobNo))
				tempList.add(mobNo);
				numberList = tempList;
		}
		directory.put(name, numberList);
	}
	public static List<Integer> searchByName(String name){
		return directory.get(name);
	}
	
	public static void main(String[] args) {
		addNumber("Adarsh",9892);
		addNumber("Adarsh",9000);
		addNumber("Adarsh",9100);
		addNumber("Adarsh",9020);
		addNumber("Singh",9192);
		addNumber("Singh",9192);
		System.out.println(searchByName("Adarsh"));
		System.out.println(searchByName("Singh"));
	}
	


}
