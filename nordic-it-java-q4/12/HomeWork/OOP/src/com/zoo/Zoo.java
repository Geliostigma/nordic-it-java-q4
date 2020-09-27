package com.zoo;

import com.zoo.animal.Chameleon;
import com.zoo.animal.Elephant;
import com.zoo.exception.NegativeAgeException;

public class Zoo {

	public static void main(String[] args) {

		try {
			Chameleon chameleon = new Chameleon("chameleon", -5, "green", true);

		} catch (NegativeAgeException e) {
			System.out.println(e.getMessage());

		}
		
		try {
			Elephant elephant = new Elephant("elephant", -100, "gray", false);

		} catch (NegativeAgeException e) {
			System.out.println(e.getMessage());

		}

	}

}
