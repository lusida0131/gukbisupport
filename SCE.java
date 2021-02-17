package ch04;

public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = "+ num2 + '\n'); // '\n' Àº °³ Çà
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
				
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + (num1-20));
		System.out.println("num2 = " + (num2+10));
		
		result = ((num1 += 10) > 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+ (num1-20));
		System.out.println("num2 = " +(num2+10));

		System.out.println(((25*5)+(36-4)-72)/5);
		
		int a = 3+6;
		int b = a+9;
		int c = b+12;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); 
		
		int n1 = ((25+5)+(36/4)-72)*5;
		int n2 = ((25*5)+(36-4)+71)/4;
		int n3 = (128/4)*2;
		result = (n1>n2) && (n2>n3);
		System.out.println("result = " + result);
		
				
	}

}
