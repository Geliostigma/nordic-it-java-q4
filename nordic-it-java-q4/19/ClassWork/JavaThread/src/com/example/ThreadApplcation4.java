package com.example;

import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadApplcation4 {

	public static void main(String[] args) throws InterruptedException {
		var unservedCustomers = new ArrayBlockingQueue<Integer>(10);
		var servedCustomers = new ArrayBlockingQueue<Integer>(40);
		
		
//		new LinkedBlockingQueue<Integer>();
//		new ArrayBlockingQueue<Integer>(0);
//		new CopyOnWriteArrayList<Integer>();
//		
//		
//		new Hashtable<String, String>();
//		new ConcurrentHashMap<String, String>();
//		new ConcurrentSkipListSet<String>();
//		new ConcurrentSkipListMap<String, String>();
		
		
		var executors = Executors.newFixedThreadPool(2);
		
		
		for (int i = 1; i <= 10; i++)
			unservedCustomers.add(i);

		var cashbox1 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox2 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox3 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox4 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		
		var result = executors.submit(cashbox1);
		try {
			var obj = result.get();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		executors.execute(cashbox2);
		executors.execute(cashbox3);
		executors.execute(cashbox4);
		
		executors.awaitTermination(10, TimeUnit.SECONDS);
		
		executors.shutdown();
		
//		cashbox1.start();
//		cashbox2.start();
//		cashbox3.start();
//		cashbox4.start();
//		
//		for (int i = 11; i <= 20; i++)
//			unservedCustomers.put(i);
//		
//		cashbox1.join();
//		cashbox2.join();
//		cashbox3.join();
//		cashbox4.join();
		
		System.out.println(unservedCustomers.size());
		System.out.println(servedCustomers);
		System.out.println(servedCustomers.size());
	}

}
