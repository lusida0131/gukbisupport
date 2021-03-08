package ch21;

class Box1<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class PrimitivesAndGeneric {

	public static void main(String[] args) {
		Box1<Integer> iBox = new Box1<>();
		iBox.set(125);
		int num = iBox.get();
		System.out.println(num);
		iBox.set(120);
		System.out.println(iBox.get());

	}

}
