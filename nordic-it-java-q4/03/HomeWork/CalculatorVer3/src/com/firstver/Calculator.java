package com.firstver;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Программа вычисляет сумму, разность, умножение и деление двух чисел.\n");
		var scanner = new Scanner(System.in);
		var count = 0;
		do {
			System.out.println("Выберите операцию(действие): \n");
			System.out.println("Для сложения(+) нажмите - \"1\"");
			System.out.println("Для вычитания(-) нажмите - \"2\"");
			System.out.println("Для умножения(*) нажмите - \"3\"");
			System.out.println("Для деления(/) нажмите - \"4\"");
			System.out.println("Для целочисленного деления(div) нажмите - \"5\"");
			System.out.println("Для остатка от деления(mod) нажмите - \"6\"");
			System.out.println("Для возведения в натуральную степень целого числа(^) нажмите - \"7\"");
			var a = scanner.nextInt();
			if (a >= 1 && a <= 7) {
				switch (a) {
				case 1: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					System.out.println("Решение:\n" + x + "+" + y + "=" + (x + y));
					count = 1;
					break;

				}
				case 2: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					System.out.println("Решение:\n" + x + "-" + y + "=" + (x - y));
					count = 1;
					break;

				}
				case 3: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					System.out.println("Решение:\n" + x + "*" + y + "=" + (x * y));
					count = 1;
					break;

				}
				case 4: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					if (y != 0) {
						System.out.println("Решение:\n" + x + "/" + y + "=" + (x / y));
						count = 1;

					} else {
						System.out.println(
								"Вы ввели некорректную команду, на \"0\" делить нельзя, пожалуйста повторите попытку.\n");

					}
					break;

				}
				case 5: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					if (y != 0) {
						System.out.println("Решение:\n" + x + "div" + y + "=" + ((int) x / (int) y));
						count = 1;

					} else {
						System.out.println(
								"Вы ввели некорректную команду, на \"0\" делить нельзя, пожалуйста повторите попытку.\n");

					}
					break;

				}
				case 6: {
					System.out.println("Введите первое число:");
					double x = scanner.nextDouble();
					System.out.println("Введите второе число:");
					double y = scanner.nextDouble();
					if (y != 0) {
						System.out.println("Решение:\n" + x + "mod" + y + "=" + ((int) x % (int) y));
						count = 1;

					} else {
						System.out.println(
								"Вы ввели некорректную команду, на \"0\" делить нельзя, пожалуйста повторите попытку.\n");

					}
					break;

				}
				case 7: {
					System.out.println("Введите первое число:");
					var x = scanner.nextInt();
					System.out.println("Введите степень числа:");
					var y = scanner.nextInt();

					int z;
					var num = y;

					if (y >= 0) {
						for (z = 1; num != 0; num--) {
							z = (z * x);
						}
						System.out.println("Решение:\n" + x + "^" + y + "=" + z);
						count = 1;

					} else {
						System.out.println("Вы ввели некорректную команду, пожалуйста повторите попытку.\n");

					}
					break;

				}

				}

			} else {
				System.out.println("Вы ввели некорректную команду, пожалуйста повторите попытку.\n");

			}

		} while (count == 0);

	}

}