package ch03;

public class IntegerListerals {

	public static void main(String[] args) {
		int num1 = 123; // 10���� ǥ��
		int num2 = 0123; // 8���� ǥ��
		int num3 = 0x123; // 16���� ǥ��
				
		System.out.println("num1: " + num1);
		System.out.println("num2: "+ num2);
		System.out.println("num3: "+ num3);
		
		System.out.println("11 + 22 + 33 = " +(11+22+33));
		System.out.println("011 + 022 + 033 = " +(011+022+033));
		System.out.println("0x11 + 0x22 + 0x33 =" +(0x11+0x22+0x33));
	//	System.out.println(3147483647 + 3147483648); int���� �Ѿ�� ������ ����. long�̶�� ǥ�ø� �ؾߵȴ�.
		System.out.println(3147483647l + 3147483648l); 
		
		byte seven = 0B111;
		int num205 = 0B11001101;
		System.out.println("seven: " + seven);
		System.out.println("num205: " + num205);
		System.out.println(3.0004999D + 2.0004999D);
		System.out.println(3.0004999f + 2.0004999f);
		
	}

}
