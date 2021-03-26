package ch31;

import java.time.ZoneId;

class ZoneldDemo2 {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds()
				.stream()
				.filter(s -> s.startsWith("Asia"))
				.sorted()
				.forEach(s -> System.out.println(s));
	}
}
