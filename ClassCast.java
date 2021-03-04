package ch18;

class Board { }
class PBoard extends ClassCast {  }

class ClassCast {
	public static void main(String[] args) {
		try {
		ClassCast pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println("..intermidiate location..");
		ClassCast ebd1 = new ClassCast();
		PBoard ebd2 = (PBoard)ebd1;
		}
		catch(Throwable e) {
			System.out.println("Board는 PBoard로 형변환이 안되요");	
		}
	}
}
