package com.java8_praticeSet;

public class Q1 {
	
	
	@FunctionalInterface
	   interface IntOperation{
		int apply(int x,int y);
	}
	public static void main(String[] args) {
		IntOperation add=(int x,int y)-> x+y;
		System.out.println("Addition :"+add.apply(3,4));
		
		IntOperation sub=(int x,int y)-> x-y;
		System.out.println("Subtraction :"+sub.apply(5,4));
		
		IntOperation mul=(int x,int y)-> x*y;
		System.out.println("Multiplication :"+mul.apply(3,3));
		
		IntOperation div=(int x,int y)-> x/y;
		System.out.println("Division :"+div.apply(4,2));
		
	}

}
