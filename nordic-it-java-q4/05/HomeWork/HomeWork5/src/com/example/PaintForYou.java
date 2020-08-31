package com.example;

import java.util.Scanner;

public class PaintForYou {

	public static void main(String[] args) {

		System.out.println("Программа рисует рамку вокруг текста.");

		var scanner = new Scanner(System.in);

		System.out.println("Введите длину");
		var lenght = scanner.nextInt();
		var countLen = lenght;
		var halfLen = (lenght / 2);

		System.out.println("Введите ширину");
		var width = scanner.nextInt();

		System.out.println("Введите текст");
		String text = scanner.next();
		int textLen = text.length();
		int indent = (width - textLen) / 2;

		if (lenght > 2 && width > 2 && textLen < width-1) {

			for (int i = width; i > 0; i--) {
				System.out.print("*");

			}

			System.out.println();
			countLen--;

			while (countLen != 0 && halfLen + 1 != countLen) {

				System.out.print("*");

				for (int i = width - 2; i > 0; i--) {
					System.out.print(" ");
				}

				System.out.print("*");
				System.out.println();
				countLen--;

			}

			System.out.print("*");

			if (width % 2 == 0) {

				for (int i = indent - 1; i > 0; i--) {
					System.out.print(" ");
				}

			} else {

				for (int i = indent - 1; i > 0; i--) {
					System.out.print(" ");

				}

			}

			System.out.print(text);

			if (width % 2 == 0) {

				for (int i = indent; i > 0; i--) {
					System.out.print(" ");

				}

			} else {

				for (int i = indent - 1; i > 0; i--) {
					System.out.print(" ");

				}

			}

			System.out.print("*");
			System.out.println();
			countLen--;

			while (countLen > 1) {

				System.out.print("*");

				for (int i = width - 2; i > 0; i--) {
					System.out.print(" ");
				}

				System.out.print("*");
				System.out.println();
				countLen--;

			}

			for (int i = width; i > 0; i--) {
				System.out.print("*");

			}

		} else
			System.out.println("Ошибка");

	}

}
