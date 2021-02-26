package ch12;

public class EnhanceForInst {

	public static void main(String[] args) {
		Box1[] ar = new Box1[5];
		ar[0] = new Box1(101, "coffee");
		ar[1] = new Box1(202, "Computer");
		ar[2] = new Box1(303, "Apple");
		ar[3] = new Box1(404, "Dress");
		ar[4] = new Box1(505, "Fairy-tale book");
		
		for(Box1 e: ar)
			if(e.getBoxNum() == 505)
				System.out.println(e);
		

	}

}
