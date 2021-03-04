package ch17;

class MultiPrinter extends SimplePrinter1 {
	public void printLine(String str) {
		super.printLine("Start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}

}
