package com.saran.app;
///15) Write a program for method overriding example

class Assin_Q15 {
	void draw() {
		System.out.println("Cannot say shape Type");

	}
}

class square extends Assin_Q15 {
	@Override
	void draw() {

		System.out.println("Square shape");

	}
}

class demo {
	public static void main(String[] args) {
		Assin_Q15 r = new square();
		r.draw();
	}
}
