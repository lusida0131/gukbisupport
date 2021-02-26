package ch13;

class SuperSubStatic {

	public static void main(String[] args) {
		SuperCLS1 obj1 = new SuperCLS1();
		SuperCLS1 obj2 = new SuperCLS1();
		
		SubCLS1 obj3 = new SubCLS1();
		obj3.showCount();
	}

}
