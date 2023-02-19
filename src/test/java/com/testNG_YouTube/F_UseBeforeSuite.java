package com.testNG_YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class F_UseBeforeSuite {
	
	
//	intha mathiri eluthum pothu time consumption korayum. 
//  neraya code um elutha thevayilla
//	
	
	
	
	WebDriver driver;
	long l;
	long l1;
	
	@BeforeSuite
	public void launchTheBrowser() {
		 l = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");	
	}
	@Test
	public void openFacebook() {
		driver.get("https://www.facebook.com/");
		}
	@Test
	public void openinta() {
			driver.get("https://www.instagram.com/");	
	}
	@Test
	public void openTestleaf() {
		driver.get("https://www.testleaf.com/");
	}
	
	@AfterSuite
	public void closeTheBrowser() {
		driver.quit();
		l1 = System.currentTimeMillis();
		long total = l1-l;
		System.out.println("Totol time taken : "+total);
		
	}
	
}
