package com.testNG_YouTube;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class L_AllAnnotations {
	
//	NOTE : 
//		1.Here, Order of process
//		2.If we have a multiple test case then the console will print before method and after method for each test cases.
//	
//	
//	
	
  @Test
  public void test1() {
	  System.out.println("I am test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("I am test 2");  
  }
  
  
  @Test
  public void test3() {
	  System.out.println("I am test 3");  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am affter suite");
  }

}
