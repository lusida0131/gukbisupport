package ch15;

class CompFriend {
	private String name;
	private String department;
	private String phone;
	
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
		
	}
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}

}
