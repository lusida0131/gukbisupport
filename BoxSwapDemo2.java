package ex21;

class Box<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
}
class BoxSwapDemo2 {
	private static void swapBox(Box<Integer> box1, Box<Integer> box2) {
		box1.set(55);
		box2.set(99);				
	}
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
	}
}
