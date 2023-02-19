package com.testNG_ClassPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getWindowsHandle {

	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		}
	
	@BeforeTest
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
	}
	@BeforeClass
	public void openNykaa() {
		driver.navigate().to("https://www.nykaa.com/");
	}
	@BeforeMethod
	public void openFB() {
		driver.navigate().to("https://www.facebook.com/");
	}
	@Test	
	public void getIdOfActiveWindows() {
	
		Set<String> s = driver.getWindowHandles();
		for(String i : s) {
			//System.out.println(driver.getTitle());
			System.out.println(driver.switchTo().window(i).getTitle());
		}
	}
	
	@AfterSuite
	public void quite() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
