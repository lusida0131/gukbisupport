package ch23;

import java.util.Comparator;
import java.util.TreeSet;
class Person1 implements Comparable<Person1> {
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() { return name + " : " + age;}
	
	@Override
	public int compareTo(Person1 p) {
		return this.age - p.age;
	}
}
class PersonComparator implements Comparator<Person1> {
	public int compare(Person1 p1, Person1 p2) {
		return p2.age - p1.age;
	}
}
class ComparatorPerson {

	public static void main(String[] args) {
		TreeSet<Person1> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person1("YOON", 37));
		tree.add(new Person1("HONG", 53));
		tree.add(new Person1("PARK", 22));
		
		for (Person1 p : tree)
			System.out.println(p);

	}

}
