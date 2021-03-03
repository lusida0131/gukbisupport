package ch15;

class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	public void ShowInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}

}
