package ch17;

class InstanceofInterface {

	public static void main(String[] args) {
		Printable1 prn1 = new SimplePrinter1();
		Printable1 prn2 = new MultiPrinter();
		
		if (prn1 instanceof Printable1) {
			prn1.printLine("This is a simple printer");
			System.out.println();
		}
		if (prn2 instanceof Printable1) {
			prn2.printLine("This is a multi printer");
		}
	}

}
