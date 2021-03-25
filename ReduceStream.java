package ch29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class ReduceStream {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "simple", "Complex", "Robot","stringmethod");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
//		String str = ls.stream()
		String str = ls.parallelStream()
						.reduce("", lc);
		System.out.println(str);
	}

}
