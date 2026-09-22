package com.kodewala.threads2;

class CompressFiles extends Thread
{
	@Override
	public void run()
	{
		System.out.println("CompressFiles.run() "+ Thread.currentThread().getName());
	}
	
}

public class Driver2 {

	public static void main(String[] args) {
		
		CompressFiles thread1 = new CompressFiles();
		thread1.start();

	}

}
