package ch15;

class Box2 {
	public void wrap() {
		System.out.println("Simple Wrapping");
	}

}
class PaperBox2 extends Wrapping2 {
	public void wrap() {
		System.out.println("Paper Wrapping");
	}

}
class GoldPaperBox2 extends PaperBox2 {
	public void wrap() {
		System.out.println("Gold Wrapping");
	}

}
class Wrapping2 {
	public static void main(java.lang.String[] args) {
		Box2 box1 = new Box2();
		PaperBox2 box2 = new PaperBox2();
		GoldPaperBox2 box3 = new GoldPaperBox2();
		
		box1.wrap();
		box2.wrap();
		box3.wrap();
		
		
	}
}