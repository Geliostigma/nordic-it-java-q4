package com.zoo;

import java.util.List;

import com.exception.NegativeValueException;

import com.zoo.animal.Animal;
import com.zoo.animal.Dog;


//class A {
//	private Object a;
//	private int b;
//	
//	public double c = a / (double)b;
//	
//	public A() {
//		
//	}
//	
//	public A(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}
//}




public class Zoo {

	public static void main(String[] args) throws NegativeValueException {
//		var a = "Siblings";
//		var b = "Teheran";
		
		List<Integer> a = List.of(1,2,3);
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		Animal dog = new Dog();
//		var dog1 = new Dog();
//		var dog2 = new Dog();
//		
		System.out.print(dog);
//		
//		dog.setName("Джон");
//		dog.setAge(10);
//		dog.setBreed("Хаски");
//		dog.setColor("Белая");
//		dog.setTrained(true);
//		
//		dog.move(2.5f);
//		
//		
//		try {
//			dog.eat(-5);
//		}
//		catch (NegativeValueException ex) {
//			System.out.println(ex.getMessage());
//		}
//		finally {
//			System.out.println("finally");
//		}
////		dog.name = "Мяу";
//		dog.say();
//		System.out.println(dog.getName());
//		System.out.println(dog.getName());
//		
//		System.out.println(Dog.getCount());
//		
//		throw new NegativeValueException("");
	}

}
