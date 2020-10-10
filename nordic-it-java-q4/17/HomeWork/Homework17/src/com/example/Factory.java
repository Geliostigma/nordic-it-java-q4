package com.example;

class FactoryThread extends Thread {
	
}

public class Factory {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            FactoryThread thread1 = new FactoryThread();
            FactoryThread thread2 = new FactoryThread();
            
            thread1.start();
            thread2.start();
        }
        
        for (int i = 0; i < 20; i++) {

            FactoryThread thread3 = new FactoryThread();
            
            thread3.start();
        }
        
        for (int i = 0; i < 20; i++) {

        	FactoryThread thread4 = new FactoryThread();
            FactoryThread thread5 = new FactoryThread();
            
            thread4.start();
            thread5.start();
        }
        
        for (int i = 0; i < 20; i++) {

            FactoryThread thread6 = new FactoryThread();
            
            thread6.start();
        }
        
    }
}