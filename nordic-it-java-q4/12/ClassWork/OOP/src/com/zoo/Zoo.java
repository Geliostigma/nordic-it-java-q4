package com.zoo;

import com.exception.NegativeValueException;
import com.zoo.animal.Animal;
import com.zoo.animal.Dog;

public class Zoo {

	public static void main(String[] args) throws NegativeValueException {
		var dog = new Dog();
		var dog1 = new Dog();
		var dog2 = new Dog();
		
		System.out.print(dog);
		
		dog.setName("Джон");
		dog.setAge(10);
		dog.setBreed("Хаски");
		dog.setColor("Белая");
		dog.setTrained(true);
		
		dog.move(2.5f);
		
//		try {
//			throw new NegativeValueException("Привет");
//		}
//		catch (NegativeValueException ex) {
//			System.out.println(ex.getMessage());
//		}
//		finally {
//			System.out.println("finally");
//		}
//		dog.name = "Мяу";
		dog.say();
		System.out.println(dog.getName());
		System.out.println(dog.getName());
		
		System.out.println(Dog.getCount());
		
		throw new NegativeValueException("");
	}

}
