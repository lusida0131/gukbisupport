package ch28;

import java.util.Optional;

class NullPointerCaseStudy2 {
	public static void showCompAddr(Optional<Friend> f) {
		String addr = f.map(Friend :: getCmp)
				       .map(Company :: getCInfo)
				       .map(ContInfo :: getAdrs)
				       .orElse("There is no address information.");
		System.out.println(addr);
		String name = f.map(Friend :: getName)
						.orElse("there is no name");
		System.out.println(name);
		String cname = f.map(Friend :: getCmp).map(Company :: getCName)
						.orElse("There no cname");
	}
	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321 - 444- 577","Republic of Korea");
		Company cp = new Company("YaHo co. , Ltd.", ci);
		Friend frn = new Friend("LEE Su", cp);
		showCompAddr(Optional.of(frn));
		System.out.println(frn.getName());
	}
}
