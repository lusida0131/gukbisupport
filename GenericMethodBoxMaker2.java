package ch21;
class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

class GenericMethodBoxMaker2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("My Generic Method");
		
		String str = Unboxer.<String>openBox(box);
		System.out.println(str);

	}

}
