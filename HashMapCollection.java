package ch23;

import java.util.HashMap;

class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(25, "Brown");
		map.put(34, "James");
		map.put(55, "Martin");
		
		System.out.println("25번: " + map.get(25));
		System.out.println("34번: " + map.get(34));
		System.out.println("55번: " + map.get(55));
		
		map.remove(34);
	
		System.out.println("34번: " + map.get(34));
		map.put(34, "찬영");
		System.out.println("new 34번: " + map.get(34));
	}
}
