package randomNumbers;

import java.util.Random;

public class Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number = new Random();
		/*
		int counter = 0;
		int results = 0;
		int high = 2;
		int low = 1;
		int heads = 0;
		int tails = 0;
		for (counter = 1; counter <= 100000; counter++) {
			results = low + number.nextInt(high - low + 1);
			if (results == 1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads: " + heads + " Tails: " + tails);
		
		
		int counter = 0;
		int randNumber = 0;
		int high = 13;
		int low = 1;
		int three =0;
		for (counter = 1; counter <= 87; counter++) {
			randNumber = low + number.nextInt(high - low + 1);
			if (randNumber%3==0) {
				three++;
			}}
		System.out.println("Multiples of 3: " + three);*/
		int counter = 0;
		int randNumber = 0;
		int high = 43;
		int low = 26;
		int three =0;
		for (counter = 1; counter <= 248; counter++) {
			randNumber = low + number.nextInt(high - low + 1);
			if (randNumber>36) {
				three++;}}
		System.out.println("More than 3 feet: " + three);
		
	}

}
