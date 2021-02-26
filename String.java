package ex10;

public class String {

	public static void main(java.lang.String[] args) {
		StringBuilder a1 = new StringBuilder("990925-");
		a1.delete(6, 7);
		a1.append(' ');
		a1.append(1012999);
		
		System.out.println(a1);
	}
}
