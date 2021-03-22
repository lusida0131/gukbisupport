package ch25;
enum Scale {
	DO, RE, MI, FA, SO, RA, TI
}

class SimpleEnum {
	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println(sc);
		
		switch(sc) {
		case DO:
			System.out.println("도 ~~~");
			break;
		case RE:
			System.out.println("레 ~~~");
			break;
		case MI:
			System.out.println("미 ~~~");
			break;
		case FA:
			System.out.println("파 ~~~");
			break;
		case SO:
			System.out.println("솔 ~~~");
			break;
		default:
			System.out.println("라 시  ~~~");
		}
	}
}
