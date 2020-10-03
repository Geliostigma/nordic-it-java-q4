package com.zoo;

import java.util.HashSet;

import com.zoo.exception.AddIdenticalAnimalsException;
import com.zoo.exception.AviaryOverflowException;
import com.zoo.animal.Animal;
import com.zoo.animal.Chameleon;
import com.zoo.animal.Elephant;
import com.zoo.animal.Rabbit;
import com.zoo.exception.NegativeAgeException;
import com.zoo.exception.NullAviaryException;

public class Zoo {

	public static void aviaryAdd(HashSet<Animal> aviary, Animal animal)
			throws AviaryOverflowException, AddIdenticalAnimalsException, NullAviaryException {

		if (aviary == null || aviary.equals(null)) {
			throw new NullAviaryException("Вальера не существует");
		}
		if (aviary.size() > 15) {
			throw new AviaryOverflowException("Размер не может быть больше 15");
		}

		if (aviary.contains(animal)) {
			throw new AddIdenticalAnimalsException("Не возможно добавить одинаковых животных");
		}

		aviary.add(animal);

	}

	public static void main(String[] args) {
		Rabbit rabit1 = new Rabbit("Zaiats", 2, "white", true);
		Rabbit rabit2 = new Rabbit("Zaiats", 2, "white", true);

		HashSet<Animal> aviary1 = new HashSet<Animal>(15);
		HashSet<Animal> aviary2 = new HashSet<Animal>(15);
		HashSet<Animal> aviary3 = new HashSet<Animal>(15);

		try {
			for (int i = 0; i < 20; i++) {
				Rabbit rabit = new Rabbit("Zaiats", i, "white", true);
				aviaryAdd(aviary2, rabit);
			}
		} catch (AviaryOverflowException | AddIdenticalAnimalsException | NullAviaryException e) {
			System.out.println(e.getMessage());
		}

		try {
			aviaryAdd(aviary1, rabit1);
		} catch (AviaryOverflowException | AddIdenticalAnimalsException | NullAviaryException e) {
			System.out.println(e.getMessage());
		}

		try {
			aviaryAdd(aviary1, rabit2);
		} catch (AviaryOverflowException  | AddIdenticalAnimalsException | NullAviaryException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			aviaryAdd(aviary3, rabit2);
		} catch (AviaryOverflowException  | AddIdenticalAnimalsException | NullAviaryException e) {
			System.out.println(e.getMessage());
		}

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
