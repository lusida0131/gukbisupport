package ch13;

class SubCLS extends SuperCLS {
	public SubCLS() {
		System.out.println("Con: SubCLS()");
	}
	public SubCLS(int i) {
		super(i);
		System.out.println("Con: SubCLS(int i)");
	}
	public SubCLS(int i, int j) {
		super(i, j);
		System.out.println("Con: SubCLS(int i, int j)");
	}

}
