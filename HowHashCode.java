package ch23;

import java.util.HashSet;
import java.util.Objects;

class Car {
	private String model;
	private String color;
	
	public Car(String m, String c) {
		model = m;
		color = c;
	}
	@Override
	public String toString() {
		return model + " : " + color;
	}
	@Override
	public int hashCode() {
//		return (model.hashCode() + color.hashCode()) / 2;
		return Objects.hash(model, color);
	}
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
		if(model.equals(m) && color.equals(c))
			return true;
		else
			return false;
	}
}
class HowHashCode {

	public static void main(String[] args) {
		HashSet<Car> set = new HashSet<>();
		set.add(new Car("HY_MD_301", "RED"));
		set.add(new Car("HY_MD_301", "Black"));
		set.add(new Car("HY_MD_302", "RED"));
		set.add(new Car("HY_MD_302", "White"));
		set.add(new Car("HY_MD_301", "Black"));
		System.out.println("�ν��Ͻ� �� : " + set.size());
		
		for(Car car : set)
			System.out.println(car.toString() + '\t');
	}

}
