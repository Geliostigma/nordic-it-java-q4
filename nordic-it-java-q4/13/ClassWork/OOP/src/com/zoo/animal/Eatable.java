package com.zoo.animal;

import com.exception.NegativeValueException;

public interface Eatable {
	
	void eat(int gramms) throws NegativeValueException;

}
