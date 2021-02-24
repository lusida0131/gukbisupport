package ch09;

class SinusCap1 {
	SinivelCap siCap = new SinivelCap();
	SneezeCap szCap = new SneezeCap();
	SnuffleCap sfCap = new SnuffleCap();
	
	void take() {
		siCap.take(); szCap.take(); sfCap.take();
	}
}

//class ColdPatient2 {
//	void takeSinus(SinusCap cap) {
//		cap.take();	
//	}
//}

public class CompEncapsulation {

	public static void main(String[] args) {
		ColdPatient1 suf = new ColdPatient1();
		suf.takeSinus(new SinusCap());
	}

}
