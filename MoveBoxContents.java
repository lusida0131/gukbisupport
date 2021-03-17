package ch22;
class BoxContentsMover {
	public static void moveBox(Box1<? super Toy> to, Box1<? extends Toy> from) {
		to.set(from.get());
	}
}
class MoveBoxContents {
	public static void main(String[] args) {
		Box1<Toy> box1 = new Box1<>();
		box1.set(new Toy());
		Box1<Toy> box2 = new Box1<>();
		
		BoxContentsMover.moveBox(box2, box1);
		System.out.println(box2.get());
	}
}
