package ch11;

public class ImmutableString {

	public static void main(String[] args) {
		String str5 = "Simple string";
		//String str6 = "Simple string";
		String str6 = str5;
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if (str5.equals(str6))
			System.out.println("str5과 str6는 동일 인스턴스 참조");
		else
			System.out.println("str5과 str6는 다른 인스턴스 참조");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		

	}

}
