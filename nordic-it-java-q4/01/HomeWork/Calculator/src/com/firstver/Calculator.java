package com.firstver;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("��������� ��������� ����� ���� �����.");
		var scanner = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		var x = scanner.nextInt();
		System.out.println("������� ������ �����:");
		var y = scanner.nextInt();
		System.out.println("�������:\n" + x + "+" + y + "=" + (x+y) );
	}

}
