package com.kodewala.threads2;

class EmailSender extends Thread {
	@Override
	public void run() {
		// When thread is in RUNNING state  --> 
		// Thread is doing work/task
		// from RUNNING to WAITING/BLOCKED
		// Once Waiting is over thread move to RUNNABLE state
		// Once CPU allows, thread moved to RUNNING state
		// Once run method is completed by thread, the it moves to TERMINATED(Dead) state
		System.out.println(" Sending email...." + Thread.currentThread().getName());
	}
}

public class Driver1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// Once Thread object is created, State = NEW
		EmailSender t1 = new EmailSender();
		
		// State = RUNNABLE
		t1.start(); // NEW --> RUNNABLE
		t1.start(); // TERMINATED --> X
		// Once CPU gives time to execute/run then state will be RUNNING

	}

}
