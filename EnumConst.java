package ch25;
enum Person2 {
	MAN, WOMAN;
	@Override
	public String toString() { return "I am a dog person"; }
}
class EnumConst {

	public static void main(String[] args) {
		System.out.println(Person2.MAN);
		System.out.println(Person2.WOMAN);
	}
}
