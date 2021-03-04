package ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a?");
			int n1 = kb.nextInt();
			System.out.print("a/b...a?");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
		}
//		catch(ArithmeticException e) {
//			e.getMessage();
//		}
//		catch(InputMismatchException e) {
//			e.getMessage();
//		}
		catch(ArithmeticException | InputMismatchException e) {
			e.getMessage();
		}
		System.out.println("Good Bye~~!");
	}
}
