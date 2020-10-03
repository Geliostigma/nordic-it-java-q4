package com.zoo.animal;

public abstract class Animal {

	public abstract void say();
	
	public void eat(int food) {
		--food;
	}
	
	public int weight(int mass) {
		
		return mass * 10;
		
	}
	
	public double weight(double mass) {
		
		return mass * 9.80665;
		
	}
	
	

}
