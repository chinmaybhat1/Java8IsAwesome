package com.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable");
			}
		});

		thread.run();

		Thread myLambdaThread = new Thread(() -> System.out.println("Inside Lambda Runnable"));
		myLambdaThread.run();

	}
}
