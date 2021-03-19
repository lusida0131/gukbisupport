package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class SortCollections {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "RoBot", "Weapon");
		list = new ArrayList<>(list);
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		Collections.sort(list);
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
	}
}
