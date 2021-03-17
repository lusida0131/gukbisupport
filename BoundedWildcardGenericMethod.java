package ch22;
class Robot {
	@Override
	public String toString() { return "I am Robot";}
}
class BoxHandler3 {
	public static <T> void outBox(Box1<? extends T> box) {
		T t = box.get();
		System.out.println(t);
	}
	public static <T> void inBox(Box1<? super T> box, T n) {
		box.set(n);
	}
}
class BoundedWildcardGenericMethod {

	public static void main(String[] args) {
		Box1<Toy> tBox = new Box1<>();
		BoxHandler3.inBox(tBox, new Toy());
		System.out.println(tBox);
		
		Box1<Robot> rBox = new Box1<>();
		BoxHandler3.inBox(rBox, new Robot());
		System.out.println(rBox);
	}

}
