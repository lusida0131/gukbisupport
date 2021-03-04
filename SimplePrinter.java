package ch17;


class Printer implements Printable {
	public void printLine(String str) {
		System.out.println(str);
	}
}
class SimplePrinter {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable prn = new Printer();
		prn.print(myDoc);
		
		Printable.printLine("end of line");
	}

}
