package ch06;

public class InfRecul {

//	public static void main(String[] args) {
//		showHi(3);
//	}
//	
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		if (cnt == 1)
//			return;
//		showHi(--cnt);
//	}
	
//	public static void main(String[] args) {
//		System.out.println(infinity(4));
//	}
//	
//	public static int infinity(int n) {
//		if (n == 1)
//			return 1;
//		
//		return 2 * infinity(n - 1);
//	}
	
	public static void main(String[] args) {
		ten(30);
		}
	
		public static int ten(int n) {
			if (n > 0) {
				int a = n % 2;
				n /= 2;
			
				ten(n);
				System.out.print(a);
			}
			return 0;
		}
	
}
