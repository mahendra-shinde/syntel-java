package com.mahendra;

import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		List numbers = new ArrayList();

		numbers.add(new Integer(52));
		numbers.add(new Integer(155));
		numbers.add("123");
		
		//Calculate Average
		int sum = 0;
		for(Object obj : numbers) {
			Integer n = (Integer)obj;
			sum += n.intValue();
		}
		System.out.println("Average : "+sum/numbers.size());
		
	}

}
