package com.javeaex.ex05;

public class RetangleApp {
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(6,4);
		Rectangle c = new Rectangle(6,4);
		Rectangle d = new Rectangle(6,4);
		Rectangle e = new Rectangle(6,4);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(d.equals(e));
	}

}
