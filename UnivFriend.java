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
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	}

}
