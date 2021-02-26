package ch12;

class Box1 {
	private String contents;
	private int boxNum;
	
	Box1(int num, String cont) {
		boxNum = num;
		contents = cont;
	}
	public String toString() {
		return contents;
	}
	public int getBoxNum() {
		return boxNum;
	}
}
