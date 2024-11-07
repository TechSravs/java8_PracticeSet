package com.java8_praticeSet;

public class Q5 {
	
	@FunctionalInterface
	interface MathOperation{
		double calculator(double a,double b);
	}

	public static void main(String[] args) {
		MathOperation mod=(a,b)-> a%b;
		MathOperation power=(a,b)->Math.pow(a, b);//lambda power operation
		double a=10,b=3;//test the operation
		System.out.println("Modulus: "+mod.calculator(a, b));
		System.out.println("power: "+power.calculator(a,b));


	}

}
