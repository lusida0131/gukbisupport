package ch11;

public class ImmutableString {

	public static void main(String[] args) {
		String str5 = "Simple string";
		//String str6 = "Simple string";
		String str6 = str5;
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if (str5.equals(str6))
			System.out.println("str5�� str6�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str5�� str6�� �ٸ� �ν��Ͻ� ����");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");
		

	}

}
