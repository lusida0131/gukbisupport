package ch31;

import java.time.LocalDate;
import java.time.Period;

class LocalDateDemo2 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: " + xmas);
		Period left =Period.between(today, xmas);
		System.out.println("Xmas���� ������ " + left.getMonths() + "�� " + left.getDays() + "��");
		LocalDate x = LocalDate.of(2018, 4, 17);
		Period leave =Period.between(x, today);
		System.out.println("�����ϰ� ������: " + leave.getYears() + "�� " + leave.getMonths() +"�� " + leave.getDays() + "��");
	}
}
