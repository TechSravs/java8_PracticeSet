package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("sravani","shaiksha","vani","guru","jaya");
		long s=l.stream().filter(n->n.startsWith("j")).count();
		System.out.println(s);

	}

}
