package code;

import java.util.Arrays;

@FunctionalInterface
interface AddInterface {
	public int add(int num1, int num2);
}

public class SortStringWithLambda {

	int ns = 12;
	static int s = 10;

	public static void main(String[] args) {
		String[] strArray = { "ef", "bd", "hb", "cd", "ab" };

		System.out.println("Sorting using Lambda Expression ");

		Arrays.sort(strArray, (a, b) -> {
			return a.compareTo(b);
		});

		for (String str : strArray) {
			System.out.print(str + " ");
		}

		final int z = 34;
		int n = 6;
		// Addition of two numbers using Lambda Expressions
		System.out.println("Addition of two numbers with static and non-static values are :- ");
		AddInterface addObject = (a, b) -> a + b + z + n + s + new SortStringWithLambda().ns;

		System.out.println(addObject.add(531, 324));

	}
}
