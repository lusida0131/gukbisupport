package ch05;

public class DoWhileBasic {

	public static void main(String[] args) {
		int num = 0;
	
		do {
			System.out.println("I like Java" + num);
			num++;
		} while (num<5);

		
		//예제1번
		int n = 1;
		int sum = 0;
		while (n<100) {
			sum+=n;
			n++;
			System.out.println(sum);
		}
		
		
		//예제2번
		int c = 1;
		while(c<101) {
			System.out.println(c++);
		}
		c=100;
		do {
			System.out.println(c--);
		} while(c>0);
		
		
		//예제3번
		int sum1 = 0;
		int d = 1;
		while (d < 1001) {
			if ((d % 2) == 0 && (d % 7) == 0) {
					System.out.println(d);	
					sum1 += d;
			}
				d++;				
		}
			System.out.println(sum1);
	}

}


		
		
	



