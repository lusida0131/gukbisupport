package ch27;
interface HowLong {
	int len(String s);
}
class OneParmAndReturn {
	public static void main(String[] args) {
		HowLong hl = s -> s.length();
		System.out.println(hl.len("I am  so happy"));
	}
}
