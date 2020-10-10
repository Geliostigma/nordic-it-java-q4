package com.example;

import java.util.*;

public class MyInteger {

	public static void main(String[] args) {

		List <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		numbers.forEach(s -> System.out.print(s + " "));
	}
}