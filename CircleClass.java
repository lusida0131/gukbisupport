package ex10;

class Point {
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}

class Circle {
	int a, b, v;
	public Circle(int a, int b, int v) { 
		this.a = a;
		this.b = b;
		this.v = v;
		
	}	
	public void showCircleInfo() {
		System.out.print(a + "," + b + "," + v);
	}
}	

public class CircleClass {

	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}

}
