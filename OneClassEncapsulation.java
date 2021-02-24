package ch09;

class SinusCap {
	void sniTake() {
		System.out.println("Äà¹°ÀÌ ½Ï~ ³³´Ï´Ù.");
	}
	void sneTake() {
		System.out.println("ÀçÃ¤±â°¡ ¸Ü½À´Ï´Ù.");
	}
	void snuTake() {
		System.out.println("ÄÚ°¡ »½ ¶Õ¸³´Ï´Ù.");
	}
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}

class ColdPatient1 {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}
class OneClassEncapsulation {

	public static void main(String[] args) {
		ColdPatient1 suf = new ColdPatient1();
		suf.takeSinus(new SinusCap());		
	}

}
