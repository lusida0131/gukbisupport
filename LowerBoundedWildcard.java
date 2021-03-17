package ch22;
class Unboxer2 {
	public static void peekBox(Box1<? super Integer> box) {
		System.out.println(box);
	}
}
class LowerBoundedWildcard {

	public static void main(String[] args) {
		Box1<Integer> iBox = new Box1<Integer>();
		iBox.set(5577);
		
		Box1<Number> nBox = new Box1<Number>();
		nBox.set(new Integer(9955));
		
		Box1<Object> oBox = new Box1<>();
		oBox.set("My simple Instance");
		
		Unboxer2.peekBox(iBox);
		Unboxer2.peekBox(nBox);
		Unboxer2.peekBox(oBox);
	}
}
