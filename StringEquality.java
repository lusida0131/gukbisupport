package ch18;

public class StringEquality {

	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		if(str1 == str2)
			System.out.println("str1, str2 ���� ��� �����ϴ�");
		else
			System.out.println("str1, str2 ���� ��� �ٸ���");
		
		if(str1.equals(str2))
			System.out.println("str1, str2 ���� �����ϴ�.");
		else
			System.out.println("str1, str2 ���� �ٸ���.");
	}

}