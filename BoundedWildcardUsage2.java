package ch22;

class BoxHandler2 {
	public static void outBox(Box1<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box1<? super Toy> box, Toy n) {
		box.set(n);
	}
}	
class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box1<Toy> box = new Box1<>();
		BoxHandler2.inBox(box,  new Toy());
		BoxHandler2.outBox(box);
	}
}