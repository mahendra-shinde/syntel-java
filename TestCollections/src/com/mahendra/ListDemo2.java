package com.mahendra;

import java.util.*;

public class ListDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(new Integer(52));
		numbers.add(new Integer(155));
		numbers.add("123");
		
		//Calculate Average
		int sum = 0;
		for(Integer n : numbers) {
			
			sum += n.intValue();
		}
		System.out.println("Average : "+sum/numbers.size());
		
	}

}
