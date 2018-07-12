package com.mahendra;

public class Statistics {
	public double average(double nums[]) {
		double sum = 0;
		for(double n : nums) {
			sum += n;
		}
		
		return sum/nums.length;
	}
	
	public static void main(String[] args) {
		Statistics st = new Statistics();
		double[] data = {25.5,3.5,110,25.5,35.46};
		double avg = st.average(data);
		System.out.println("Average: "+avg);
	}
}
