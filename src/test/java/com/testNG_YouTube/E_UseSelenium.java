package com.testNG_YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class E_UseSelenium {

	
	@Test
	public void openGoogle() {
		
		System.out.println("for google open time");
		long l =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.quit();		//if we don't use quit, then 4 times browser will open(for each methods)
		
		long l1 = System.currentTimeMillis();
		long total = l1-l;
		System.out.println(total);
	}
	@Test
	public void openFacebook() {
		
		System.out.println("for fb open time");
		long l = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		long l1 = System.currentTimeMillis();
		long total = l1-l;
		System.out.println(total);
	}
	@Test
	public void openinta() {
		
		System.out.println("for insta open time");
		long l= System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
		long l1 = System.currentTimeMillis();
		long total = l1-l;
		System.out.println(total);
	}
	@Test
	public void openTestleaf() {
		
		System.out.println("for testleaf open time");
		long l = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testleaf.com/");
		driver.quit();
		long l1 = System.currentTimeMillis();
		long total = l1-l;
		System.out.println(total);
	}
	
	
}
