package ch06;

public class MethodDef {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		hiEveryone(12);
		hiEveryone(13);
		byeEveryone();
		System.out.println("���α׷� ��");
	}
	
	public static void hiEveryone(int age) {
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
//		byeEveryone();
	}
	
	public static void byeEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}
}
