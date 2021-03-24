package ch26;

class Lambda3 {
	public static void main(String[] args) {
		Printable1 prn = (s) -> {System.out.println(s);};
		prn.print("What is Lambda?");
	}
}
