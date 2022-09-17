package com.saran.app;

//13) Write a program for Method overloading example.
class Ass_Q13 {
	int add() {
		int a = 10, b = 20, c;
		c = a + b;
		return c;
	}

	void add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
	}

	void add(int x, double y) {
		double c;
		c = x + y;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Ass_Q13 r = new Ass_Q13();
		r.add(100, 200);
		r.add(50, 45.32);
		int add = r.add();
		System.out.println(add);
	}

}