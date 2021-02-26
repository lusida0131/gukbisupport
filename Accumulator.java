package ex10;

public class Accumulator {
	static int sum = 0;
	public static void main(java.lang.String[] args) {
		for (int i = 0; i < 10; i++)
			Accumulator.add(i);
			Accumulator.showResult();

		}
		
	public static int add(int i) {
		return sum += i;
		}

	static void showResult() {
		System.out.println(sum);
		}

	}