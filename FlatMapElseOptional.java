package ch28;

import java.util.Optional;
class ContInfo1{
	Optional<String> phone;
	Optional<String> adrs;
	public ContInfo1(Optional<String> ph, Optional<String> ad) {
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
class FlatMapElseOptional {

	public static void main(String[] args) {
		Optional<ContInfo1> ci = Optional.of(
				new ContInfo1(Optional.ofNullable(null), Optional.of("Republic of Korea"))
				);
		String phone = ci.flatMap(c -> c.getPhone())
						 .orElse("There's no phone number.");
		String addr = ci.flatMap(c -> c.getAdrs())
						.orElse("There's no address");
		System.out.println(phone);
		System.out.println(addr);

	}

}
