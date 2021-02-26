package ch13;

public class TwoDimenArray3 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
