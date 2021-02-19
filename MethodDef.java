package ch06;

public class MethodDef {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		byeEveryone();
		System.out.println("프로그램 끝");
	}
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
//		byeEveryone();
	}
	
	public static void byeEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
}
