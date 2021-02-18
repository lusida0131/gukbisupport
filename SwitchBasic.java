package ch05;

public class SwitchBasic {

	public static void main(String[] args) {
		int n = 2;
		System.out.println("Do you like Java?");
		switch(n) {
		case 1 :
			System.out.println("simple Java");
			break;
		case 2 :
			System.out.println("Funny Java");
			break;
		case 3 :
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
			
		}
		int a = 6;
		switch(a) {
		case 1:
		case 2:
		case 3:
			System.out.println("case 1, 2, 3");
			break;
		default:
			System.out.println("default");
			
			
		int b = 5;
		if (b == 1) {
			System.out.println("simple Java");
			System.out.println("Funny Java");
			System.out.println("Fantastic Java");
			System.out.println("The best programming language");
			}
		
			else if (b == 2) { 
			System.out.println("Funny Java");
			System.out.println("Fantastic Java");
			System.out.println("The best programming language");
			}
			else if (b == 3) { 
			System.out.println("Fantastic Java");
			System.out.println("The best programming language");
			}
		else 
			System.out.println("The best programming language");
			}
		}	
	}
	

