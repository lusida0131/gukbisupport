package ch04;

public class BitShiftOp {

	public static void main(String[] args) {
		byte num;
		
		num = 2;  //00000010
		System.out.print((byte)(num << 1) + " "); //00000100
		System.out.print((byte)(num << 2) + " "); //00001000
		System.out.print((byte)(num << 3) + " " + '\n'); //00010000
		
		
		num = 8; //00001000
		System.out.print((byte)(num>>1) + " "); //00000100
		System.out.print((byte)(num>>2) + " "); //00000010
		System.out.print((byte)(num>>3) + " " + '\n'); //00000001
		
		num= -8; //11111000
		System.out.print((byte)(num >> 1) + " "); //11111100               음수 2진법 바꾸는 법 = 숫자 반대로 쓰고 뒤에 자리만 +1 해준다.
		System.out.print((byte)(num >> 2) + " "); //11111110          
		System.out.print((byte)(num >> 3) + " " + '\n'); //11111111           
	}

}
