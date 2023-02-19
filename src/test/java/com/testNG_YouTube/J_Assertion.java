package com.testNG_YouTube;

import org.testng.Assert;
import org.testng.annotations.Test;

public class J_Assertion {
//
//
//	mainly assertion used for unit testing. In automation testing we don't use assertion mostly.
//	so, just know this.
//  Not important.
	

	@Test
	public void assertionEx() {
		
		String myName = "vicky";
		

		
		Assert.assertEquals(myName, "vicky"); // to check whether the value is equal or not   .
		
		
	}
	
	@Test
	public  void assertionEx1() {
		boolean s =true;
		Assert.assertTrue(s,"this is true");
		
	}
	
	@Test
	public void assertionEx2() {
		
		boolean s =false;
		Assert.assertFalse(s, "this is false");
	}
	
	
	
}
