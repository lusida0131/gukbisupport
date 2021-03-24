package ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AnonymousComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("box");
		list.add("Apple");
		list.add("Robot");
		
		Comparator<String> cmp = new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
			}
		};
		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
