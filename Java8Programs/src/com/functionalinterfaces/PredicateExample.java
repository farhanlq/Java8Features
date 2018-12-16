package com.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		
		 Predicate<Integer> predicate = p-> p%2==0;
		 
		 System.out.println("Predicate to check the numbers is even or not");
		 System.out.println(predicate.test(5));
		 System.out.println(predicate.test(10));
	}

}
