package com.ozerbey.multithreading.runnable;

public class Main {

	public static void main(String[] args) {
		// implements runnable
		for (int i = 0; i < 100; i++) {
			ThreadIs threadIs = new ThreadIs(23, "thread implementation for runnable ");
			threadIs.run();			
			Thread thread =new Thread(threadIs);
			thread.start();
		}

	}
}
