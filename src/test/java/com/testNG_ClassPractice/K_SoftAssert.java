package com.testNG_ClassPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class K_SoftAssert {
		
	
	int a = 10;
	int b = 20;

	@Test
	public void add() {
		int total = a + b;
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(total, 500);
		System.out.println(total);
	}
	
	@Test
	public void add1() {
		int total = a + b;
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(total, 5000);
		soft.assertAll();
		System.out.println(total);
	}
	
	@Test
	public void add2() {
		int total = a + b;
		
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(total, 500);
		System.out.println(total);
	}
	
	
	
}
