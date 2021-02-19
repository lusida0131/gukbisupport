package ch06;

public class MethodReturns {

//	public static void main(String[] args) {
//		int result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 =" + result);
//		System.out.println("3.5 x 3.5 =" + square(3.5));
//	}
//	
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	
//	public static double square(double num) {
//		return num*num;
//	}

	
	
	
	
//	public static void main(String[] args) {
//		int result;  
//		result = aa(5,6);
//		System.out.println(result);
//		System.out.println(bb(5,6));
//	}
//	
//	public static int aa(int num1, int num2) {
//		int aaa = num1 / num2;
//		return aaa;
//	}
//	
//	public static int bb(int num3, int num4) {
//		int bbb = num3 % num4;
//		return bbb;
//	}
	
	
	
	
	
//	public static void main(String[] args) {
//		int result;
//		result = cc(5,6);
//		if(result > 0) {
//			System.out.println(result);
//		}
//		else
//			System.out.println("num2가 num1보다 크다");
//			System.out.println(result);
//	}
//	
//	public static int cc(int num1, int num2) {
//		int ccc = num1 - num2;
//		return ccc;
//	}
	
	
	
	

	public static void main(String[] args) {
		abs(7,3);
		abs(3,7);		
	}
	
	public static void abs(int num1, int num2) {
		if(num1 > num2)
			System.out.println(num1 - num2);
		else
			System.out.println(num2 - num1);
	}
	
	
	
}

