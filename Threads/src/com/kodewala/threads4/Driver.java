package com.kodewala.threads4;

class Task {

	public synchronized void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" Printing : " + i + " ["+Thread.currentThread().getName() +"]");
		}
	}

}
class PrinterThread extends Thread {
	Task task;

	PrinterThread(Task _task) {
		this.task = _task;
	}

	@Override
	public void run() {
		task.printNumbers();
	}
}
public class Driver {
	public static void main(String[] args) 
	{
		Task task1 = new Task(); // lock = 1
		
        PrinterThread t1 = new PrinterThread(task1); // Donny's account
        t1.setName("FirstThread");
        t1.start();
        
        Task task2 = new Task(); //  lock = 1 // Sanjay's account 
        
        PrinterThread t2 = new PrinterThread(task2);
        t2.setName("2ndThread");
        t2.start();
	}
}
