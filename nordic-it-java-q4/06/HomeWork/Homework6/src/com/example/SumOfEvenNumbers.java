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
		System.out.println("��������� ������� �� ����� ����� ���� ������ �����");

		System.out.print("������� �����: ");
		var y = scanner.nextInt();

		System.out.print("����� ���� ������ �����: ");
		System.out.print(resultSumOfEvenNumbers(y));

	}

}
