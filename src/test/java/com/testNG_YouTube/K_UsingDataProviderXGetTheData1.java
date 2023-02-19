package com.testNG_YouTube;


import org.testng.annotations.Test;

public class K_UsingDataProviderXGetTheData1 {
	
	
 // Get the data from one class to another class
// Here, we get the data from class ---> K_UsingDataProviderPassTheData1 
	
	
	@Test (dataProvider ="Find", dataProviderClass=K_UsingDataProviderPassTheData1.class)
	public void getData(String a , String b) {
		System.out.println(a+"    "+b);
		
	}
	
}
