package com.zoo.animal;

import com.exception.NegativeValueException;

public class Dog extends Animal implements Movable, Eatable {
	
	private static int count;
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Dog.count = count;
	}

	public Dog() {
		count++;
	}
	
	
	
	public Dog(String name, int age, String breed, String color, boolean isTrained) {
		super();
		this.age = age;
		this.breed = breed;
		this.isTrained = isTrained;
		this.color = color;
		count++;
	}

	@Override
	public void say() {
		System.out.println("гав");
		
	}

	@Override
	public void move(int meters) {
		System.out.println("Прыгнул на " + meters + " метров");
	}
	
	public void move(float meters) {
		System.out.println("Прыгнул на " + meters + " метров");
	}

	@Override
	public void eat(int gramms) throws NegativeValueException {
//		if (gramms < 0) {
			throw new NegativeValueException("");
//		}
		// TODO Auto-generated method stub
		
	}
	
}
