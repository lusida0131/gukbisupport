package ch28;

import java.util.Optional;

class Friend1 {
	String name;
	Optional<Company1> cmp;
	
	public Friend1(String n, Optional<Company1> c) {
		name = n;
		cmp = c;
	}
	public String getName() {
		return name;
	}
	public Optional<Company1> getCmp() {
		return cmp;
	}
}
class Company1 {
	String cName;
	Optional<ContInfo2> cInfo;
	
	public Company1(String cn, Optional<ContInfo2> ci) {
		cName = cn;
		cInfo = ci;
	}
	public String getCName() {
		return cName;
	}
	public Optional<ContInfo2> getCInfo() {
		return cInfo;
	}
}
class ContInfo2 {
	Optional<String> phone;
	Optional<String> adrs;
	
	public ContInfo2(Optional<String> ph, Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}
	public Optional<String> getPhone() {
		return phone;
	}
	public Optional<String> getAdrs() {
		return adrs;
	}
}
class NullPointerCaseStudy3 {

	public static void showCompAddr1(Optional<Friend1> f) {
		String addr = f.flatMap(Friend1 :: getCmp)
						.flatMap(Company1 :: getCInfo)
						.flatMap(ContInfo2 :: getAdrs)
						.orElse("There is no address information.");
		System.out.println(addr);
	}
	public static void main(String[] args) {
		Optional<ContInfo2> ci = Optional.of(
				new ContInfo2(Optional.ofNullable(null), Optional.of("Republic of Korea")));
		Optional<Company1> cp = Optional.of(new Company1("YaHo co., Ltd.", ci));
		Optional<Friend1> frn = Optional.of(new Friend1("LEE So", cp));
		showCompAddr1(frn);
	}
}
