package ch08;

public class InfoHideCircle {

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("반지름: " + c.getRad());
		System.out.println("넓 이: " + c.getArea() + '\n');
		
		c.setRad(3.4);
		System.out.println("반지름: " + c.getRad());
		System.out.println("넓 이: " + c.getArea());
		
	}

}
