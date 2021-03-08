package ch21;

class BoxInBox {

	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");

		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		System.out.println(zBox.get().get().get());
	}
}
