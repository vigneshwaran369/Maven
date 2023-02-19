package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class A_OpenABrowser {
	WebDriver driver;
	@Test (priority=-2)
	public void openGoogle() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("browser launched");
	}
	@Test (priority = -1)
	public void searchMadurai() {
		System.out.println("search result is madurai");
		driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
	}
	@Test (priority=0)
	public void closeTheBrowser() {
		System.out.println("browser closed");
		driver.close();
	}
	
	@Test (priority=1)
	public void googleOpened() {
		System.out.println("browser launched successefully////");
	}

	@Test (priority=2)
	public void openedMadurai() {
		System.out.println("got the results of madurai");
	}
//	
//	NOTE : 1.If you don't want to run a particular method we can use @Ignore .
//		   2.Also we can use enabled=false keyword.
	
	@Ignore
	@Test
	public void closed() {
		System.out.println("browser closed successefully");
	}
}


