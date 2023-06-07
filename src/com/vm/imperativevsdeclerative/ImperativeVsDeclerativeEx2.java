package com.vm.imperativevsdeclerative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclerativeEx2 {
	/**
	 * 
	 * @author Suraj_Mahli (6th July 23)
	 */
	
	public static void main(String[] args) {
		/**
		 * Use Case: remove duplicates from an ArrayList
		 */
		
		//Data Set
		List<Integer> integerList = Arrays.asList(1,2,2,3,4,5,5,6,7,8,9,6);
		
		/**
		 * Imperative - How style of programming
		 */
		
		List<Integer> imperativeUniqueList = new ArrayList<>();
		for(Integer i : integerList) {
			if(!imperativeUniqueList.contains(i)) {
				imperativeUniqueList.add(i);
			}
		}
		
		System.out.println("Imperative approach of programming :"+imperativeUniqueList);

		/**
		 * Declarative - What style of programming
		 */
		
		List<Integer> declarativeUniqueList = integerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Declarative approach of programming :"+declarativeUniqueList);
	}

}
