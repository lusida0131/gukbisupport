package ch26;
class Papers1 {
	private String con;
	public Papers1(String s) {
		con = s;
	}
	public Printable getPrinter() {
		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}
}
class UseLocalInner {
	public static void main(String[] args) {
		Papers1 p = new Papers1("서루 내용: 사랑합니다.");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
