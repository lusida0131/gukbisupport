package ch22;
interface Getable<T> {
	public T get();
}
class Box3<T> implements Getable<T> {
	private T ob;
	public void set(T o) { ob = o; }
	
	@Override
	public T get() {
		return ob;
	}
}
class GetableGenericInterface {

	public static void main(String[] args) {
		Box3<Toy> box = new Box3<>();
		box.set(new Toy());
		
		Getable<Toy> gt = box;
		System.out.println(gt.get());

	}
}
