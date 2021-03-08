package ch21;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}
class Banana {
	public String toString() {
		return "I am a Banana.";
	}
}
class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
//class AppleBox {
//	private Apple ap;
//	
//	public void set(Apple a) {
//		ap = a;
//	}
//	public Apple get() {
//		return ap;
//	}
//}
//
//class OrangeBox {
//	private Orange or;
//	
//	public void set(Orange o) {
//		or = o;
//	}
//	public Orange get() {
//		return or;
//	}
//}
class FruitAndBox {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		Box<Banana> bBox = new Box<Banana>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		bBox.set(new Banana());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		Banana ba = bBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		System.out.println(ba);
	}
}
