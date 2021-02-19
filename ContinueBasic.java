package ch05;

public class ContinueBasic {

	public static void main(String[] args) {
		int count = 0;
		
		for (int num = 1; num<100; num++) {
			if (((num % 5) != 0) || ((num % 7) != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
		
		
		//规过1)
//		int sum = 0;    
//		for (int num1 = 1; num1<65; num1++) {
//			if (num1 % 2 == 1) {
//				sum += num1;
//				if (sum < 1000) {
//					System.out.println(sum);
//				}
//				else System.out.println(sum);
//				
//			}				
//		}
		
		
		//规过2)
		int sum = 0;    
		for (int num1 = 1; sum<1000; num1++) {
			if (num1 % 2 == 1) {
				sum += num1;
				System.out.println(sum);
			}				
		}
		
	}
}


