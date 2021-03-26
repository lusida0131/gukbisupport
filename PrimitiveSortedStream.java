package ch30;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

class PrimitiveSortedStream {
	public static void main(String[] args) {
		IntStream.of(1, 2, 3, 4, 5)
				.sorted()
				.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		DoubleStream.of(1.1, 2.2, 3.3, 3.2)
					.sorted()
					.forEach(s -> System.out.print(s + "\t"));
	}
}
