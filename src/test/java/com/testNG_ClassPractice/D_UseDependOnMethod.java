package com.testNG_ClassPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D_UseDependOnMethod {

	WebDriver driver;
	
	@Test (priority=-3)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test (priority=-2)
	public void goToFlipkart() {
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	
	@Test(priority=-1)
	public void searchMobile() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+Keys.ENTER);
	}
	
	@Test(priority=0)
	public void selectTheMobile() throws InterruptedException {
		Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[6]")).click();	
	
	}
	
	@Test(priority=1)
	public void signIn()  {
		System.out.println("Did not sign in");
		throw new RuntimeException("sign in first");
	}
	
	
	@Test (priority=2,dependsOnMethods = "signIn") 
	public void buyTheMobile() {
		
		Set<String> id = driver.getWindowHandles();
		for(String mobiles:id) {
			System.out.println(driver.switchTo().window(mobiles).getTitle());
			String s="MOTOROLA G62 5G ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com\r\n"
					+ "";
			if(mobiles.contains(s)) {
				break;
				
			}
		}
		
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}
	
	@Test  (priority=3,alwaysRun = true)
	public void closeAll() {
		driver.quit();
	}
}
