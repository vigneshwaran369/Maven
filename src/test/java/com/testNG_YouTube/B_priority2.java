package com.testNG_YouTube;

import org.testng.annotations.Test;

public class B_priority2 {

	
	// normal ah priority kuduthum , priority kudukkaama irukkura test method la first priority 0 ahyum normal method ahyum
	// -- compare pannum. appo antha time la priority 0 kuduthaalum normal method la alphabet munnadi iruntha normal method than
	//-- first run aagum athukkapparam  than priority 0 run aagum
	// EX :
	//		priority=0
//				public void firstOne(){  }
//                                  
//	
//				public void alwaysFirstOne(){  }
//	
//	ippo alwaysFirstOne than firt run aagum athukkapparam than firstOne run aagum
//	
//	
//	priority 0 mudinja udane normal method than run aagum
//	
//	
	@Test(priority=0)
	public void firstOne() {
		System.out.println("i am the firstOne");
	}
	
	@Test(priority=1)
	public void secondOne() {
		System.out.println("i am the secondOne");
	}
	
	@Test
	public void thirdOne() {
		System.out.println("i am the thirdOne");
	}
	
	@Test(priority=2)
	public void fourthOne() {
		System.out.println("i am the fourthOne");
	}
	
	
}
