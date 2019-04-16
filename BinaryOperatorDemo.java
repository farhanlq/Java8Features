package code;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> result = (a,b) -> a+b;
		System.out.println(result.apply(53, 2));
		
	}
}
