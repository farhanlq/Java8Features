package code;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> result = (value) -> System.out.println(value);
		result.accept("ABC Systems Pvt. Ltd");
	}
}
