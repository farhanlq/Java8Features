package code;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> result = () -> new Integer((int) (Math.random() * 1000D));
		System.out.println(result.get());
	}
}
