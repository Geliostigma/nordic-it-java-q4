package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsExample {
	
	public static int sum(ArrayList<? extends Number> array) {
		var sum = 0;
		for (Number n : array) {
			sum += (int)n;
		}
		return sum;
	
	}

	public static void main(String[] args) throws IOException {
		ArrayList array = new ArrayList();
		array.add(10);
		array.add(12);
		array.add(14);
		
		var sum = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof Integer)
				sum += (int)array.get(i);
		}
		System.out.println(sum);
		
		Object[] t = new Integer[5];
		
		ArrayList<? extends Number> array1 = new ArrayList<Integer>();
		ArrayList<Long> array2 = new ArrayList<Long>();
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("gg");
		System.out.println(sum(array1));
		System.out.println(sum(array2));
//		System.out.println(sum(array3));
		
		var box = new Box<Integer>();
		box.setValue(5);
		var value = box.getValue();
		System.out.println(value + 5);
		
		
		var box1 = new Box<String>();
//		if (value instanceof Integer)
//			System.out.println((int)value + 5);

	}

}
