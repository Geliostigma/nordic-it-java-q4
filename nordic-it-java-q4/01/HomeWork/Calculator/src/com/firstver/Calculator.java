package com.firstver;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Программа вычисляет сумму двух чисел.");
		var scanner = new Scanner(System.in);
		System.out.println("Введите первое число:");
		var x = scanner.nextInt();
		System.out.println("Введите второе число:");
		var y = scanner.nextInt();
		System.out.println("Решение:\n" + x + "+" + y + "=" + (x + y));
	}

}
