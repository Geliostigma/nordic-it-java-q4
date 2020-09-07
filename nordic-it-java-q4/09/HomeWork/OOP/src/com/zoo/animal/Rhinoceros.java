package com.zoo.animal;

public class Rhinoceros {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;

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
		System.out.println("Хрр");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}
	
	public void horn() {
		System.out.println("Полирует рог");
		
	}

	public void walk() {
		System.out.println("Гуляет по саванне");
		
	}

}
