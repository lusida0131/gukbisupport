package ch31;

import java.time.ZoneId;

class ZoneldDemo1 {

	public static void main(String[] args) {
		ZoneId paris = ZoneId.of("Europe/Paris");
		System.out.println(paris);
	}
}
