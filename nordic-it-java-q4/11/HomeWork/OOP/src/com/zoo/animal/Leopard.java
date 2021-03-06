package com.zoo.animal;

public class Leopard extends Animal implements Huntable, Killable {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;

	public Leopard() {
		
	}

	public Leopard(String name, int age, String color, boolean sexMale) {
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
		System.out.println("Рравр");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}

	@Override
	public void killable() {
		
	}

	@Override
	public void huntable() {
		
	}
	
}
