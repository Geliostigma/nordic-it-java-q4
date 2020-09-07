package com.zoo.animal;

class A {
	
	private String name;
	private Integer age;
	
	public A(String name, Integer age) {
		this.name = name;
		this.age = age;
		System.out.println("0");
	}
	
	public A(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("1");
	}
	
	public A(String name, double age) {
		this(name, (int)age);
	}
	
}

public class Test {

	public static void main(String[] args) {
		var a = new A("", null);
	}

}
