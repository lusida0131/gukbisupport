package ch08;

class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}

	public void setRad(double r) {
		if (r < 0) {
			r = 0;
			return;
		}
		rad = r;
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
	
	public double getRad() {
		return rad;
	}
}


