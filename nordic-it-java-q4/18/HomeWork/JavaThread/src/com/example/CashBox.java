package com.example;

import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CashBox implements Runnable {
	
	private ArrayBlockingQueue<Integer> unserved;
	private ArrayBlockingQueue<Integer> served;
	
	public CashBox(ArrayBlockingQueue<Integer> unserved, ArrayBlockingQueue<Integer> served) {
		this.unserved = unserved;
		this.served = served;
	}

	@Override
	public void run() {
		while (process());	
	}
	
	public boolean process() {
		Integer client = unserved.poll();
		
		if (client == null) {
			return false;
		}
		else {
			served.add(client);
		}
		return true;
	}

}
