package code;

import java.util.Arrays;
import java.util.Comparator;

class StringSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}

public class SortStringWithoutLambda {

	public static void main(String[] args) {

		String[] strArray = { "ef", "bd", "hb", "cd", "ab" };

		System.out.println("Sorting using Anonymous Classes ");
		Arrays.sort(strArray, new StringSort());

		for (String str : strArray) {
			System.out.print(str + " ");
		}

	}
}
