package com.zoo.animal;

public class Seal {

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
		System.out.println("Оу-оу-оу");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}
	
	public void applause() {
		System.out.println("Хлопает ластами");
		
	}

	public void play() {
		System.out.println("Играет с мячем");
		
	}
	
}
