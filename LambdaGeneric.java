package ch27;
@FunctionalInterface
interface Calculate3 <T> {
	T cal (T a, T b);
}
class LambdaGeneric {
	public static void main(String[] args) {
		Calculate3<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(4, 5));
		
		Calculate3<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(4.7, 5.5));
	}
}
