package ch12;

class Box {
	private String conts;
	
	Box(String cont) {
		this.conts = cont;
	}
	public String toString () {
		return conts;
	}
	
	public int length() {
	return conts.length();
	}
}
