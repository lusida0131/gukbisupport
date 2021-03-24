package ch26;

class Lambda2 {
	public static void main(String[] args) {
		Printable1 prn = new Printable1() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("What is Lambda?");
	}
}
