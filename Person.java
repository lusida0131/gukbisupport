package ch11;

class Person {
	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	Person(int rnum) {
//		regiNum = rnum;
//		passNum = 0;
		this (rnum, 0);
	}
	void showPersonalInfo() {
		System.out.println("�ֹε�� ��ȣ: " + regiNum);
		
		if(passNum != 0)
			System.out.println("���ǹ�ȣ: " + passNum + '\n');
		else
			System.out.println("������ ������ ���� �ʽ��ϴ�. \n");
	}
}
