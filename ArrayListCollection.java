package ch23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		List<String> list = new LinkedList<>();
		
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		list.remove(1);
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
