package ch05;

public class CondOPp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2)? num1 : num2;
		System.out.println("ū ��:" + big);
		
		diff = (num1 > num2)? (num1 - num2) : (num2 - num1);
		System.out.println("����:" + diff);
		
		
		if (num1 > num2) {
			System.out.println("ū ��:" + num1);
		}
		else {
			System.out.println("ū ��:" + num2);
		}
		if(num1 < num2) {
			System.out.println("����:" + (num2 - num1));
		}
		else {
			System.out.println("����:" + (num1 - num2));
		}
	}

}
