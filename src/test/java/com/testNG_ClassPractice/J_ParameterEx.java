package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class J_ParameterEx {

	@Test @Parameters({"data","data2"})
	public void fb(String a,String b) {
		
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(b);
	}
	
	
	
	
	
}
