package ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class CollectStringStream {
	public static void main(String[] args) {
		String[] words = {"Hello", "Box", "Robot", "Toy"};
		Stream<String> ss = Arrays.stream(words);
		
		List<String> ls = ss.filter(s -> s.length() < 5)
							.collect(() -> new ArrayList<>(),
									(c, s) ->c.add(s),
									(ls1, ls2) -> ls1.addAll(ls2));
		System.out.println(ls);
	}
}
