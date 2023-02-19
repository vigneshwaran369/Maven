package com.testNG_YouTube;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class H_ParameterizationExample {

	
	@Test @Parameters("StudentName")
	public void findStdName(String a) {
		System.out.println("student name is : "+a);
	}
	
	@Test @Parameters("StudentName")
	public void findStdName2(String a) {
		System.out.println("Boy name is  : "+a);
		
	}
	
	@Test @Parameters("Student Name")
	public void findStudentsName(String a) {
		System.out.println("Boy name is : "+a);
		
	}
	
	 
	
	
}
