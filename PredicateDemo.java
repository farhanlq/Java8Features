package code;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (value) -> value % 2 == 0;
		System.out.println(predicate.test(45));
		System.out.println(predicate.test(12));
	}
}
