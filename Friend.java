package ch15;

class Friend {
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	public void showInfo1() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}
