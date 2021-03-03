package ch15;

class OverrideMistake {

	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 4));

	}

}
