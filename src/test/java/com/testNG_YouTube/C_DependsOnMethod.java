package com.testNG_YouTube;

import org.testng.annotations.Test;

public class C_DependsOnMethod {
//
//	oru method nadanthathan next irukkura  methods um run aaganum or oru  
//	--method innoru method ah depend panni iruntha , depends on method ah use
//	-- pannalam. 
//	
//	kittathatta priority mathiri than ithuvum but situations kku thaguntha mathiri use pannanum 
	
	
	
	@Test
	public void goToHighSchool() {
		System.out.println("i am in high school");
	}
	
	@Test(dependsOnMethods = "goToHighSchool")
	public void goToHigherSecondary() {
		System.out.println("i am in higher secondary school");
	}
	
	@Test(dependsOnMethods="goToHigherSecondary")
	public void goToCollege() {
		System.out.println("i am in college");
	}
	
	
}
