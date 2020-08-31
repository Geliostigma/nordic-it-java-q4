package com.example;

import java.util.Scanner;

public class RecursionExample {

	
	// 0 1 1 2 3 5 8 13 21 34 55 ...
	
	// n > 0
	// f(0) = 0
	// f(1) = 1
	// f(n) = f(n-1) + f(n-2)
	
	
	// fact(0) = 1
	// fact(n) = fact(n-1) * n
	
	public static int f(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return f(n-1) + f(n-2);
		}
		
	}
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		var n = scanner.nextInt();
		System.out.println(f(n));

	}

}
