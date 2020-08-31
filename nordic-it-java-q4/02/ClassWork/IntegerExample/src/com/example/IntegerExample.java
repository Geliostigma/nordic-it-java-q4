package com.example;

public class IntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127;
		Byte b = 2;
		System.out.println((byte)(a + b.byteValue()));
		
		var numberString = "1000";
		var number = Integer.parseInt(numberString, 8);
		var numberMyString = Integer.valueOf(number).toString();
		var numberMyString2 = Integer.valueOf(number).toOctalString(number);
		System.out.println(number);
		System.out.println(numberMyString2);
		
		
		var number1 = (short)128;
		var number2 = (byte)number1;
		System.out.println(number2);
		
		
		var decNumber = 136;
		var binNumber = 0b111;
		var hexNumber = 0xAA;
		var octNumber = 010;
		
		var floatNumber = 2.0f;
		var doubleNumber = 2.0d;
		
		System.out.println(binNumber);
		System.out.println(hexNumber);
		System.out.println(octNumber);
		
	}

}
