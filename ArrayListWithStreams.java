package code;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStreams {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ijk");
		list.add("def");
		list.add("abc");
		list.add("axe");
		list.add("zack");
		list.add("ilm");

		System.out.println("Streams using filter and display ");
		list.stream().filter((s) -> s.startsWith("z")).forEach(System.out::println);

		System.out.println("Streams using filter, sorting in descending order and display ");
		list.stream().filter((s) -> s.startsWith("a")).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

		System.out.println("Streams using filter, sorting and display ");
		list.stream().filter((s) -> s.startsWith("a")).sorted().forEach(System.out::println);

		System.out.println("Streams using filter, uppercase, sorting and display ");
		list.stream().filter((s) -> s.startsWith("i")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		System.out.println("Count of list elements "+list.stream().count());
		
	}
}
