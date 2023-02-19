package com.testNG_ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class K_HardAssert {

	int a = 10;
	int b = 20;

	@Test
	public void add() {
		int total = a + b;
		Assert.assertEquals(total, 35);
		System.out.println(total);
	}
	@Test
	public void add1() {
		int total =a+b;
		Assert.assertNotSame(total, 400);
		System.out.println(total);
	}
	
	@Test
	public void getTitle() {
		
		ChromeOptions s = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(s);
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "face book page";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);	
	}

	@Test
	public void getTitleAgain() {

		ChromeOptions s = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(s);
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "face book page";
		//Assert.assertSame(expectedTitle, actualTitle);
		Assert.assertNotSame(expectedTitle, actualTitle);
		System.out.println("Title name is  : "+actualTitle);	
	}
	
	@Test
	public void add3() {
		ChromeOptions s = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(s);
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		Assert.assertNull(actualTitle);
		System.out.println(actualTitle);
	}

}
