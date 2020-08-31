package com.firstver;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Программа вычисляет сумму, разность, умножение и деление двух чисел.");
		var scanner = new Scanner(System.in);
		System.out.println("Введите первое число:");
		double x = scanner.nextDouble();
		System.out.println("Введите второе число:");
		double y = scanner.nextDouble();
		System.out.println("Решение:\n" + x + "+" + y + "=" + (x+y) );
		System.out.println(x + "-" + y + "=" + (x-y) );
		System.out.println(x + "*" + y + "=" + (x*y) );
		System.out.println(x + "/" + y + "=" + (x/y) );
		System.out.println(x + "%" + y + "=" + (x%y) );
	}

}
