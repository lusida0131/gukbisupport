package ch18;

class ArrayIndexOutOfBounds {

	public static void main(String[] args) {	
		try {
		int[] arr = {1, 2, 3};
		for (int i = 0; i < 4; i++)
			System.out.println(arr[i]);
		}
		
		catch (Throwable e) {
			System.out.println("배열의 범위를 넘었습니다.");
		}

	}

}
