package com.others;

public class Usinggettersetter2 {

	
	public static void main(String[] args) {
		
		Usinggettersetter1 s = new Usinggettersetter1();

		int a = s.getA();
		System.out.println(a);
		
		s.setA(200);
		System.out.println(s.getA());
		
		
		s.setS("vigneshwaran");
		System.out.println(s.getS());
	}	
}
