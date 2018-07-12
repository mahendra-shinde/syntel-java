package com.mahendra;

import java.util.StringTokenizer;

public class StringDemo2 {

	public static void main(String[] args) {
		String month_str = "Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec";
		String []months= month_str.split(",");
		
		for(int i=0;i<months.length;i++)
		{
			System.out.println(months[i]);
		}
		
		StringTokenizer token=new StringTokenizer(month_str, ",");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	}

}
