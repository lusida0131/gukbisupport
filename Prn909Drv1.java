package ch17;

class Prn909Drv1 implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void printCMYK1(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}
