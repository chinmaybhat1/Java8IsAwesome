package com.lambda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting greeting = new GreetingImpl();
		greeter.greet(greeting);

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Anonymous Inner Class Greeting!!");
			}
		};
		greeter.greet(innerClassGreeting);

		Greeting lambdaGreeting = () -> System.out.println("Lambda Greeting!!");
		greeter.greet(lambdaGreeting);
	}
}
