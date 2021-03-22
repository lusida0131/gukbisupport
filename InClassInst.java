package ch25;
class Person1 {
	public static final Person1 MAN = new Person1();
	public static final Person1 WOMAN = new Person1();
	
	@Override
	public String toString() {
		return "I am a dog person";
	}
}
class InClassInst {
	public static void main(String[] args) {
		System.out.println(Person1.MAN);
		System.out.println(Person1.WOMAN);		
	}
}
