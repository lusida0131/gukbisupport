package ch25;
enum Animal {
	DOG, CAT
}
enum Person {
	MAN, WOMAN
}
class SafeEnum {

	public static void main(String[] args) {
		who(Person.MAN);
//		who(Animal.DOG);
	}
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남성입니다.");
			break;
		case WOMAN:
			System.out.println("여성입니다.");
			break;
		}
	}
}
