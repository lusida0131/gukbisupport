package ch05;

public class IEBasic {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		//if문
		if(n1<n2) {
			System.out.println("n1<n2 is true");
		
		}
		if (n1>n2) {
			System.out.println("n1>n2 is false");       // if문 false는 출력 안됨
		}
	//if ~ else 문
		if (n1 == n2) {
			System.out.println("n1== n2 is true");
		}
		else {
			System.out.println("n1 == n2 is false");
		}
		if (n1>n2) {
			System.out.println("n1>n2 is true");
		}
		else {
			System.out.println("n1>n2 is false");
			
		}
		
		int a = 91;
		if (a > 90) {
			System.out.println("a의 점수는 A입니다.");
		}
		else if (a>80) {
			System.out.println("a의 점수는 B입니다.");
		}
		else  {
			System.out.println("a의 점수는 F입니다.");
		}
	}

}

