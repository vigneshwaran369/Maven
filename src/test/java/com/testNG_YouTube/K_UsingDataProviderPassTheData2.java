package com.testNG_YouTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class K_UsingDataProviderPassTheData2 {
	
	
	String s[][]= {{"vicky","vicky123"},
					{"vignesh","vignesh122333"},
					{"vigneshwaran","vigneshwaran1234"}};
	
	@DataProvider (name="Find")
	public String[][] data() {
		return s;
	}
	
@Test (dataProvider="Find")
	public void openFb(String a,String b) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement f1 = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		f1.sendKeys(a);
		WebElement f2 = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		f2.sendKeys(b);
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		driver.close();
	}
	
	

}
