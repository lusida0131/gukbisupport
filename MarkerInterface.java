package ch17;

public class MarkerInterface {

	public static void main(String[] args) {
		Printer3 prn = new Printer3();
		Report doc = new Report("Simple Funny News~");
		prn.printContents(doc);

	}

}
