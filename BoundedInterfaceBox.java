package ch21;

interface Eatable {
	public String eat();
}

class Apple1 implements Eatable {
	public String toString() {
		return "I am an apple.";
	}
	@Override
	public String eat() {
		return "It tasted so good!";
	}
}
class Box2<T extends Eatable> {
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
class BoundedInterfaceBox {
	public static void main(String[] args) {
		Box2<Apple1> box = new Box2<>();
		box.set(new Apple1());
		Apple1 ap = box.get();
		System.out.println(ap);
	}
}
