package com.kodewala.threads1;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(" Executing run method...");

		System.out.println("MyThread : This code is executed by [" + Thread.currentThread().getName() + "] thread");

	}

}

public class Driver {

	public static void main(String[] args) {
        
		System.out.println(" START main()");

		System.out.println("This code is executed by [" + Thread.currentThread().getName() + "] thread");
		System.out.println(" This is my hello world"); //  main

		MyThread t1 = new MyThread();
		t1.setName("Waiter took order for food....");
		t1.start(); // main + t1

		MyThread t2 = new MyThread();
		t2.setName("Server started serving the food...");
		t2.start(); // main + t1 + t2 

		MyThread t3 = new MyThread();
		t3.setName("Cooking Food...");
		t3.start(); // main + t1 + t2 + t4
		// How many threads ? main and Thread-0
		System.out.println(" END main()");
	}

}
