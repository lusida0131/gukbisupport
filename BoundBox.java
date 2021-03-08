package ch21;

class BBox<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoundBox {
	public static void main(String[] args) {
		BBox<Integer> iBox = new BBox<>();
		iBox.set(24);
		
		BBox<Double> dBox = new BBox<>();
		dBox.set(5.97);
		System.out.println(iBox.get());
		System.out.println(dBox.get());

	}
}
