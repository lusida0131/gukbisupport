package ch03;

public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' +'c');
		System.out.println("AB" + '\t' + 'c');
		System.out.println("AB" + '\n' + 'c');
		System.out.println("AB" + '\r' + 'c');
		System.out.println("오늘의 환률은 1$에 0.88"  + " \u20AC" + "입니다.");
		
	}

}
	