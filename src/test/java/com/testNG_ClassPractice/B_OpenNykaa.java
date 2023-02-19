package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B_OpenNykaa {
	WebDriver driver;
    
	@Test (priority=0)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();	
	}
    @Test (priority=1)
	public void clickTheSingIn()  {
    	
		driver.findElement(By.xpath("//button[@aria-label='Kebab menu']")).click();
		
		driver.findElement(By.xpath("(//button[@kind='secondary'])[1]")).click();
	}
    @Test (priority=2)
	public void enterMobileNO() throws InterruptedException{
    	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
