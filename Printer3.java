package ch17;

class Printer3 {
	public void printContents(Printable3 doc) {
		if (doc instanceof Upper) {
			System.out.println((doc.getContents()).toUpperCase());
		}
		else if (doc instanceof Lower) {
			System.out.println((doc.getContents()).toLowerCase());
		}
		else
			System.out.println(doc.getContents());
	}

}
