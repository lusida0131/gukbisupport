package ch05;

public class BreakBasic {

	public static void main(String[] args) {
		int num = 1;
		boolean serch = false;
		
		//ó�� ������ 5�� ������� 7�� ����� ���� ã�� �ݺ���
		while (num<100) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				serch = true;
				break;  //while���� Ż��
			}
			num++;
		}
		if(serch)
			System.out.println("ã�� ���� : " + num);
		else
			System.out.println("5�� ������� 7�� ����� ���� ã�� ���߽��ϴ�.");
	}

}