package com.example;

import java.util.Scanner;

public class SumOfEvenNumbers {

	static int resultSumOfEvenNumbers(int x) {
		
		var res = 0;

		for (int i = 0; x >= i; i++) {
			
			if (i % 2 == 0) {
				res += i;
				
			}

		}
		
		return res;
		
	}

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		System.out.println("Программа выводит на экран сумму всех четных чисел");

		System.out.print("Введите число: ");
		var y = scanner.nextInt();

		System.out.print("Сумма всех четных чисел: ");
		System.out.print(resultSumOfEvenNumbers(y));

	}

}
