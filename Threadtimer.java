package com.java;

public class Threadtimer implements Runnable {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("thread is printing " + i + " times");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out.println("thread is interrupted when it is sleeping" + interruptedException);
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {

		Threadtimer timer1 = new Threadtimer();
		Thread thread = new Thread(timer1);
		thread.start();
		thread.join();
	}
}
