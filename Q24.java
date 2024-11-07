package com.java8_praticeSet;

import java.util.Optional;

public class Q24 {
	public static void main(String[] args) {
		sendName("sravani");
	}

	public static void sendName(String name) {
		String op=Optional.ofNullable(name).orElse("Guest");
		    System.out.println("Hello " +op);

	}

}
