package com.mahendra;

@Author(name="Mahendra Shinde")
public class Main {

	public static void main(String[] args) {
		Canvas can1 = new Canvas<Circle>(new Circle());
		Canvas<Rectangle> can2 = new Canvas<>(new Rectangle());
		
		can1.draw();
		can2.draw();
	}

}
