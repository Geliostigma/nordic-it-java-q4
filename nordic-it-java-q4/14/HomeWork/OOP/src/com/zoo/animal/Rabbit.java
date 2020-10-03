package com.zoo.animal;

public class Rabbit extends Animal implements Gnawable, Appearable {

	protected String name;
	protected int age;
	protected String color;
	protected boolean sexMale;

	public Rabbit() {
		
	}

	public Rabbit(String name, int age, String color, boolean sexMale) {
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
		System.out.println("Фыр-фыр");
	}

	public void eat(int food) {
		--food;
	}

	public void mate() {

	}

	@Override
	public void appearable() {
		
	}

	@Override
	public void gnawable() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (sexMale ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rabbit other = (Rabbit) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sexMale != other.sexMale)
			return false;
		return true;
	}
	
}
