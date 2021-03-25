package ch29;

import java.util.Arrays;
import java.util.List;

class ListStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "RoBot", "Box");
		list.stream()
			.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}
