package com.mahendra;

public class TestStrings {

	public static void main(String[] args) {
		String[] data = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" };
		StringBuilder sb = new StringBuilder();
		for (String s : data) {
			sb.append(s).append(" ");
		}

		System.out.println(sb);

	}

}
