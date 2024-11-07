package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q9 {

	public static void main(String[] args) {
		List<Double> l=Arrays.asList(12.34,56.78,90.45,43.67);
		OptionalDouble s=l.stream().mapToDouble(Double::doubleValue).average();
	s.ifPresent(n->System.out.println(n));	

	}

}
