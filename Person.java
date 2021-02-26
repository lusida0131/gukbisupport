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
		System.out.println("주민등록 번호: " + regiNum);
		
		if(passNum != 0)
			System.out.println("여권번호: " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}
