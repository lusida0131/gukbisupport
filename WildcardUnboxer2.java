package ch22;

class Box1<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Unboxer1 {
	public static <T> T openBox(Box1<T> box) {
		return box.get();
	}
	public static void peekBox(Box1<?> box) {
		System.out.println(box);
	}
}
class WildcardUnboxer2 {
	public static void main(String[] args) {
		Box1<String> box = new Box1<>();
		box.set("SO simple String");
		Unboxer1.peekBox(box);
	}
}
