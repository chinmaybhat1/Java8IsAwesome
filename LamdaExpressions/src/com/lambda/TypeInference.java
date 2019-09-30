package com.lambda;

public class TypeInference {

	public static void main(String[] args) {
		getLengthOfString(s -> s.length());
	}

	private static void getLengthOfString(StringLengthLambda lambda) {
		System.out.println(lambda.getStringLength("Hello"));
	}

	interface StringLengthLambda {
		public int getStringLength(String s);
	}
}
