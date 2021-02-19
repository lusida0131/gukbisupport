package ch06;

public class OnlyExitReturn {

//	public static void main(String[] args) {
//		divide(4,2);
//		divide(6,2);
//		divide(9,0);
//	}
//	public static void divide(int num1, int num2) {
//		if(num2 == 0) {
//			System.out.println("0오로 나눌 수 없습니다.");
//			return;
//		}
//		System.out.println("나눗셈 결과 :" +(num1 / num2));
//	}
	
	
	
	
//	public static void main(String[] args) {
//		System.out.println(calCircleArea(2.4));
//		System.out.println(calCircleRound(2.4));
//		
//	}
//	public static double calCircleArea(double rad) {
//		final double PI = 3.14;
//		return rad*rad*PI;
//	}
//	public static double calCircleRound(double rad) {
//		final double PI = 3.14;
//		return rad*2*PI;
//	}
	
	
	
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
			if(primeNumber2(i))
				System.out.println(i);
	}
	
	public static boolean primeNumber2(int a) {
		if (a == 1)
			return false;
		
		for(int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}	
}
