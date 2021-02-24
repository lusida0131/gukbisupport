package ch09;

class SinivelCap {
	void take() {
		System.out.println("Äà¹°ÀÌ ½Ï~ ³³´Ï´Ù.");
	}
}

class SneezeCap {
	void take() {
		System.out.println("ÀçÃ¤±â°¡ ¸Ü½À´Ï´Ù.");
	}
}

class SnuffleCap {
	void take() {
		System.out.println("ÄÚ°¡ »½ ¶Õ¸³´Ï´Ù.");
	}
}

class ColdPatient {
	void takeSinivelCap(SinivelCap cap) {
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
}
class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinivelCap(new SinivelCap());
		suf.takeSneezeCap(new SneezeCap());
		suf.takeSnuffleCap(new SnuffleCap());
	}
}
