package ex12;

class AddDArr {
	public static void addOneDArr(int[] arr, int add) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += add;
		
		System.out.print(arr[i]);
		}
	}
	public static void addTwoDArr(int[][] arr, int add) {
		
		for(int i = 0; i < arr.length; i++) {
			addOneDArr(arr[i], 4);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] arr1 = new int [3][4];
		addTwoDArr(arr1, 3);
		
	}
}
