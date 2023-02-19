package com.testNG_YouTube;

import org.testng.annotations.Test;

public class B_Priority3 {
//
//	NOTE: 
//		 priority order will be - to +
//	
//		Example : -5,-4,-3,-2,-1,0,1,2,3,4,5,6......
//	
	
	
	@Test (priority=-2)
	public void myFirstCase() {
		System.out.println("this is my first one");
	}
	@Test (priority=-1)
	public void mySecondCase() {
		System.out.println("this is my Second one");
	}
	@Test (priority=0)
	public void myThirdCase() {
		System.out.println("this is my Third one");
	}
	@Test (priority=1)
	public void myFourthCase() {
		System.out.println("this is my Fourth one");
	}
	@Test (priority=2)
	public void myFivthCase() {
		System.out.println("this is my Fivth one");
	}
	
	
}
