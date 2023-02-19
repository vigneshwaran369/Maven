package com.testNG_ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_WebDriverManagerEx {

	
	@Test
	public void google() {
		
		ChromeOptions google = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(google);
		driver.get("https://www.facebook.com/");

	}
	
	@Test
	public void firefox() {
		
		FirefoxOptions fire = new FirefoxOptions();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(fire);
		driver.get("https://www.facebook.com/");
		
	}
	
}
