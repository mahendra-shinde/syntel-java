package com.mahendra;


public class SwitchDemo {

	public static void main(String[] args) {
		drawLine(50,LineStyle.SINGLE);
		drawLine(70,LineStyle.DOUBLE);
		drawLine(80,LineStyle.OTHER);
	}

	
	public static void drawLine(int size,LineStyle style) {
		char ch =' ';
		switch(style) {
		case SINGLE:
			ch = '-';
			break;
		case DOUBLE:
			ch = '=';
			break;
		case DOTTED:
			ch = '.';
				break;
		case OTHER:
				ch='~';
		}
		for(int i=0;i<size;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
