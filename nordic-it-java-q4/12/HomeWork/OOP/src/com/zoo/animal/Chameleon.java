package com.zoo.animal;

import com.zoo.exception.NegativeAgeException;

public class Chameleon extends Animal implements Moveable, Hideable {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;
	
	public Chameleon() {
		
	}
	
	public Chameleon(String name, int age, String color, boolean sexMale) throws NegativeAgeException {
		this.name = name;
		this.age = age;
		this.color = color;
		this.sexMale = sexMale;
		if (age <= 0) {
			throw new NegativeAgeException("Возраст не может быть меньше 0");

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSexMale() {
		return sexMale;
	}

	public void setSexMale(boolean sexMale) {
		this.sexMale = sexMale;
	}

	public void say() {
		System.out.println("*меняет цвет*");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}

	@Override
	public void hideable() {
		
	}

	@Override
	public void moveable() {
		
	}

}
