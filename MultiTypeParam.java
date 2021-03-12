package ch21;

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
class MultiTypeParam {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
		DBox<Integer, String> box2 = new DBox<Integer, String>();
		box2.set(25, "Banana");
		System.out.println(box2);

	}

}