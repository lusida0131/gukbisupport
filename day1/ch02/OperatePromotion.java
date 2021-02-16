package ch02;

public class OperatePromotion {

	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		short result = (short)(num1 + num2);
		//short result = num1 + num2;  변수 result는 2바이트 short형이고 연산결과는 4바이트 int형이다. 그래서 형변환을 해주어야한다.
	
		System.out.println(result);

	}

}
