package com.testNG_ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_ForIRetryAnalyzer {

	@Test(retryAnalyzer=L_IRetryAnalyzerEx.class)
	public void failedCase() {
		int a = 10;
		int b = 20;
		int total = a+b;
		Assert.assertEquals(total, 400);
		System.out.println(total);
	}
	@Test
	public void  openFF() {
		FirefoxOptions ff = new FirefoxOptions();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(ff);
		driver.get("https://www.facebook.com/");
	}
	
	
	
	
	
	
	
	
	
}
