package ch15;

class MyFriends2 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend1("LEE", "Computer", "010 - 333 - 555");
		frns[cnt++] = new UnivFriend1("SEO", "Electronics", "010 - 222 - 444");
		frns[cnt++] = new CompFriend1("YOON", "R&D 1", "02 - 123 - 999");
		frns[cnt++] = new CompFriend1("PARK", "R&D 2", "02 - 321 - 777");
	
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo1();
			System.out.println();
		}
	}

}
