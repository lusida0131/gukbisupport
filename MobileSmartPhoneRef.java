package ch15;

public class MobileSmartPhoneRef {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone(" 010 - 555 - 777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010 - 999 - 333", "Nougat");
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		//ph2.playApp();

	}

}
