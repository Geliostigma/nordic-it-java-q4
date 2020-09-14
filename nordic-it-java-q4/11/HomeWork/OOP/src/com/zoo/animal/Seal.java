package com.zoo.animal;

public class Seal extends Animal implements Applaudable, Playable {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;

	public Seal() {
		
	}

	public Seal(String name, int age, String color, boolean sexMale) {
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
		System.out.println("Оу-оу-оу");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}

	@Override
	public void playable() {
		
	}

	@Override
	public void applaudable() {
		
	}
	
}
