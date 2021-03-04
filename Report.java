package ch17;

class Report implements Printable3, Upper{
	String cons;
	
	Report(String cons) {
		this.cons = cons;
	}
	public String getContents() {
		return cons;
	}
}
