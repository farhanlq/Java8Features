package code;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Long, Long> functionResult = (value) -> (value + 12l);
		System.out.println(functionResult.apply(5l));
		System.out.println(functionResult.apply(34l));

	}

}
