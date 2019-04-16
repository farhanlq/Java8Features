package code;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamReduceMethod {

	public static void main(String[] args) {
		DoubleStream doubleStream = DoubleStream.of(1.2, 3.2, 5.2);
		OptionalDouble optionalDouble = doubleStream.reduce((a, b) -> a + b);
		System.out.println(optionalDouble.getAsDouble());
	}
}
