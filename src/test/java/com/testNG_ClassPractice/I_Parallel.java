package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_Parallel {

	@Test
	public void openFB() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
		driver.quit();

	}
	
	@Test
	public void searchChennai() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
		driver.quit();
		
	}
	
	@Test
	public void buyVivoMobile() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("vivo"+Keys.ENTER);
		driver.quit();

	}
	
  	
	

	
}
