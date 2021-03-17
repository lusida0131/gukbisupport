package ch22;
class BoxHandler1 {
	public static void outBox(Box1<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box1<Toy> box, Toy n) {
		box.set(n);
	}
}
class BoundedWildcardUsage {

	public static void main(String[] args) {
		Box1<Toy> box = new Box1<>();
		BoxHandler1.inBox(box,  new Toy());
		BoxHandler1.outBox(box);
	}

}
