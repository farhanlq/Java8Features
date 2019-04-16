package code;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> result = (value) -> "Hello "+value;
		System.out.println(result.apply("XYZ"));
	}
}
