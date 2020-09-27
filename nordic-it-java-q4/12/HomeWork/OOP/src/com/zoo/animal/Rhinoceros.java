package com.zoo.animal;

public class Rhinoceros extends Animal implements Hornable, Walkable {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;

	public Rhinoceros() {
		
	}

	public Rhinoceros(String name, int age, String color, boolean sexMale) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.sexMale = sexMale;
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
		System.out.println("Хрр");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}

	@Override
	public void walkable() {
		
	}

	@Override
	public void hornable() {
		
	}
	
}
