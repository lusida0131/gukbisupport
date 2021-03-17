package ch22;


class Toy {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}
class BoxHandler {
	public static void outBox(Box1<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box1<Toy> box, Toy n) {
		box.set(n);
	}
}
class BoundedWildcardBase {

	public static void main(String[] args) {
		Box1<Toy> box = new Box1<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

	}

}
