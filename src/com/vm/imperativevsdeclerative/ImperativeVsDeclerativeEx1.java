package com.vm.imperativevsdeclerative;

import java.util.stream.IntStream;

public class ImperativeVsDeclerativeEx1 {
	/**
	 * 
	 * @author Suraj_Mahli (6th July 23)
	 */

	public static void main(String[] args) {
		/**
		 * Use Case: print sum of 1 to 100 numbers
		 */
		
		
		/**
		 * Imperative - How style of programming
		 */

		int imperativeSum = 0;
		for (int i = 0; i <= 100; i++) {
			imperativeSum+=i;
		}
		
		System.out.println("Imperative approach of programming :"+imperativeSum);
		
		/**
		 * Declarative - What style of programming
		 */
		
		int declarativeSum = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Declarative approach of programming :"+declarativeSum);
		
	}

}
