package ch09;

class SinusCap {
	void sniTake() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
	void sneTake() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
	void snuTake() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
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
