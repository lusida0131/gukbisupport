package ch10;
class AccessWay {
	static int num = 0;
	
	AccessWay() {
		incrCnt();
	}
	void incrCnt() {
		num++; //Ŭ���� ���ο��� �̸��� ���� ����
	}
}
public class ClassVarAccess {

	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		way.num++; //�ܺο��� �ν��Ͻ� �̸��� ���� ����
		AccessWay.num++; //�ܺο��� Ŭ���� �̸��� ���� ����
		System.out.println("num =" + AccessWay.num);

	}

}
