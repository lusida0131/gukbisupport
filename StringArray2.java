package ch12;

public class StringArray2 {

	public static void main(String[] args) {
		Box[] sr = new Box[7];
		sr[0] = new Box("Java");
		sr[1] = new Box("System");
		sr[2] = new Box("Compiler");
		sr[3] = new Box("Park");
		sr[4] = new Box("Tree");
		sr[5] = new Box("Dinner");
		sr[6] = new Box("Brunch Cafe");
		
		int cnum = 0;
		
		for(int i = 0; i < sr.length; i++)
			cnum += sr[i].length();
		System.out.println("ÃÑ ¹®ÀÚÀÇ ¼ö: " + cnum);
	}

}
