package ch15;

class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi ~ from " + number);
		
	}
}
