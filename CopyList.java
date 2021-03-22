package ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CopyList {
	public static void main(String[] args) {
		List<String> src = Arrays.asList("Box", "Apple", "Toy", "Roblot");
		List<String> dest = new ArrayList<>(src);
		Collections.sort(dest);
		System.out.println(dest);
		Collections.copy(dest, src);
		System.out.println(dest);
	}
}
