package com.firstver;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("��������� ��������� �����, ��������, ��������� � ������� ���� �����.");
		var scanner = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		double x = scanner.nextDouble();
		System.out.println("������� ������ �����:");
		double y = scanner.nextDouble();
		System.out.println("�������:\n" + x + "+" + y + "=" + (x+y) );
		System.out.println(x + "-" + y + "=" + (x-y) );
		System.out.println(x + "*" + y + "=" + (x*y) );
		System.out.println(x + "/" + y + "=" + (x/y) );
		System.out.println(x + "%" + y + "=" + (x%y) );
	}

}
