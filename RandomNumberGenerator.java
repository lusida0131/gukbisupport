package ch20;

import java.util.Random;

class RandomNumberGenerator {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++)
			System.out.println(rand.nextInt(46));

	}

}
