package com.testNG_YouTube;

import org.testng.annotations.Test;

public class D_SkipParticularTestCase {

	
	// if you don't want to run a particular method use enabled = false
	
	
	
	@Test(priority=0)
	public void goToLKG() {
		System.out.println("i am in lkg");
	}
	
	@Test(priority=2)
	public void goToHighSchool() {
		System.out.println("i am in highschool");
	}
	@Test(priority=5,enabled=false)
	public void dontGoToSchool() {
		System.out.println("i am going to play");
	}
	@Test(priority=3)
	public void goToHigherSec() {
		System.out.println("i am in highersecondary");
	}
	
	@Test(priority=1)
	public void goToElementary() {
		System.out.println("now i am in elementary");
	}
	
	@Test(priority = 4)
	public void  goToCollege() {
		System.out.println("i am in college");
	}
	
}
