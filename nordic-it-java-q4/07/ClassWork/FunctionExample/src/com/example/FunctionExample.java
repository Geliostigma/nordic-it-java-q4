package com.example;
import java.util.Scanner;

public class FunctionExample {
	
	public static int sumNumbers(int start, int n, int step) {
		var res = 0;
		for (var i = start; i <= n; i+=step) {
			res = res+i;
		}
		return res;
	}
	
	public static int sumEvenNumbers(int n) {
		return sumNumbers(0, n, 2);
	}
	
	public static int sumOddNumbers(int n) {
		return sumNumbers(1, n, 2);
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
//		var n = scanner.nextInt();
		
//		System.out.println(sumEvenNumbers(n));
		
		System.out.println(Integer.parseInt("asdfghjk"));

	}

}
