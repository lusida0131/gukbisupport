package ch15;

class CompFriend1 extends Friend{
	private String department;
	
	public CompFriend1(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	public void showInfo1() {
		super.showInfo1();
		System.out.println("ºÎ¼­: " + department);
	}
}
