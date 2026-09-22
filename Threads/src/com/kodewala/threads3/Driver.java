package com.kodewala.threads3;

class Task implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			if (i == 5)// some biz condition
			{
				try {
					System.out.println(" Sleeping...");
					Thread.sleep(5000); // // current thread will sleep for 5 sec.
					System.out.println(" Sleeping tgime over.. i just woke up... started work again");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				
			}
			System.out.println(" Printing : " + i);
		}

	}

}

public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver.main() START");

		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();

		System.out.println("Driver.main() END");
	}
}
