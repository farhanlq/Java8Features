package code;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		IntStream.range(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		IntStream.range(10, 20).filter(n -> n > 2).forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		IntStream.range(0, 10).filter(n -> n % 2 == 0).filter(n -> n > 2).forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		System.out.println("Sum Of Numbers are " + IntStream.of(1, 3, 5, 6, 26).sum());
		System.out.println("-------------------------------------------------------");
		System.out.println("Sum of Even Numbers are " + IntStream.of(1, 3, 4, 5, 8, 10).filter(n -> n % 2 == 0).sum());
		System.out.println("Sum of Odd  Numbers are " + IntStream.of(1, 3, 4, 5, 8, 10).filter(n -> n % 2 != 0).sum());
		System.out.println("Maximum of All  Nummbers " + IntStream.of(1, 3, 4, 5, 8, 10).max().getAsInt());
		System.out.println("Minimum of All  Nummbers " + IntStream.of(1, 3, 4, 5, 8, 10).min().getAsInt());
		System.out.println("Count of the Stream are " + IntStream.of(1, 3, 4, 5, 7, 8, 10).count());
		System.out.println("Average is " + IntStream.of(1, 3, 4, 5, 8, 10).average().getAsDouble());
		System.out.println(
				"Short Circuiting Operator (Find First) " + IntStream.of(1, 3, 4, 5, 8, 10).findFirst().getAsInt());
		System.out.println(
				"Short Circuiting Operator (Find Any) " + IntStream.of(1, 3, 4, 5, 8, 10).findAny().getAsInt());
		System.out.println(
				"Short Circuiting Operator (Any Match) " + IntStream.of(1, 3, 4, 5, 8, 10).anyMatch(n -> n > 10));
		System.out.println(
				"Short Circuiting Operator (All Match) " + IntStream.of(1, 3, 4, 5, 8, 10).allMatch(n -> n >= 1));
		System.out.println(
				"Short Circuiting Operator (None Match) " + IntStream.of(1, 3, 4, 5, 8, 10).noneMatch(n -> n >= 10));
	}
}
