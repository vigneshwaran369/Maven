package com.testNG_ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_InvocationCount {

	
	@Test(invocationCount = 3)
	public void invocationCoutEx() {
		
		long d =System.currentTimeMillis();
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.quit();
		long d1 = System.currentTimeMillis();
		long totalTime  = d1-d; 
		System.out.println(totalTime);
		
	}
	
	
	
	
}
