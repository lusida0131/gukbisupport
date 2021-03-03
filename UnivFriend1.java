package ch15;

class UnivFriend1 extends Friend{
	private String major;
	
	public UnivFriend1(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	public void showInfo1() {
		super.showInfo1();
		System.out.println("Àü°ø: " + major);
	}
}
