package com.exaple;

import java.util.Scanner;

public class IfOperator {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

        System.out.println("Введите любое число из диапозона [0; 10]");
        var a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (a <= 10) {
            System.out.println(2 * a);
        } else if (a < 100) { 
            System.out.println("Вы ввели большое число");
        } else { 
            System.out.println("Вы ввели слишком большое число");
        }

	}

}
