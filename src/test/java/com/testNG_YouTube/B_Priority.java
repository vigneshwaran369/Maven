package com.testNG_YouTube;

import org.testng.annotations.Test;

public class B_Priority {

	
	// for an insertion order we can use priority keyword to maintain the  order. 
	// priority will allow only integer value
	
	
	@Test (priority=0)
	public void myFirstTest() {
		System.out.println("this is my firstone");
	}

	@Test (priority=1)
	public void mySecondTest() {
		System.out.println("this is my secondone");
	}

	@Test (priority =2)
	public void myThirdTest() {
		System.out.println("this is my thirdone");
	}

	@Test (priority =3)
	public void myFourthTest() {
		System.out.println("this is my fourthone");
	}
	
	
}
