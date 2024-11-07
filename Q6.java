package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,3,5,77,45,35,67,45,78,25);
		int sum=l.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println("sum of even numbers: "+ sum);
		
	}

}