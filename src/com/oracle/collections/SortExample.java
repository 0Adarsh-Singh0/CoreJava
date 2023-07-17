package com.oracle.collections;

import java.util.ArrayList;
import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Delhi");
		list.add("Banglore");
		list.add("Ahmedabad");
		list.add("Chennai");
		System.out.println(list);
		for (String c:list) {
			System.out.println(c);
		}
		
		Collections.sort(list);// Inbuilt function used to sort Collections
		System.out.println("-----After Sorting------");
		System.out.println(list);
		
		Product p1= new Product(101, "T Shirt", 999.99f, 4.5f);
		Product p2= new Product(102, "Jeans", 2999.99f, 4.1f);
		Product p3= new Product(103, "Samsung Mobile", 15000f, 4);
		Product p4= new Product(104, "Alexa", 4500, 4.8f);
		Product p5= new Product(105, "USB", 1200, 4.6f);
		ArrayList<Product> productList= new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		
		System.out.println(productList);
		Collections.sort(productList,new SortByRatings());
		
		// Second Method
		//		Collections.sort(productList, new Comparator<Product>() {
		//		    public int compare(Product p1, Product p2) {
		//		        return Float.compare(p1.getPrice(), p2.getPrice());
		//		    }
		//		});
		for(Product p: productList)
			System.out.println(p.getProductName() + " " + p.getPrice() + " "+ p.getRatings());
//		System.out.println(productList);
	}

}
