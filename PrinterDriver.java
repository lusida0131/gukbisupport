package ch17;

class PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "this is a report about ...";
		
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
