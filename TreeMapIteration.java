package ch23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class TreeMapIteration {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(34, "James");
		map.put(55, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();

	}

}

