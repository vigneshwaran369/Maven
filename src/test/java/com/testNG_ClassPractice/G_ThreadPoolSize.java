package com.testNG_ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_ThreadPoolSize {

	
	
	@Test (invocationCount =2,threadPoolSize = 2)
	public void openFB() {
		
		ChromeOptions google = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(google);
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}
	
	@Test(invocationTimeOut=10000)
	public void openFB1() {
		
		ChromeOptions google = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(google);
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}
	
	@Test(description = "hey open facebook")
	public void openFB3() {
		ChromeOptions google = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(google);
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
	
	
	
	
}
