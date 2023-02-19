package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H_Groups {

	
	
	@Test(groups = "mobiles")
	public void buyVivoMobile() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("vivo"+Keys.ENTER);
		driver.quit();

	}
	@Test(groups = "mobiles")
	public void buyOppoMobile() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Oppo"+Keys.ENTER);
		driver.quit();

	}
	@Test(groups = "mobiles")
	public void buyNokiaMobile() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Nokia"+Keys.ENTER);
		driver.quit();

	}
	@Test (groups ="district")
	public void searchMadurai() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
		driver.quit();

	}
	@Test (groups ="district")
	public void searchChennai() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
		driver.quit();
		
	}
	
	@Test (groups ="district")
	public void searchTrichy() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		driver.quit();

	}
	
	@Test(groups = "socialMedia",dependsOnGroups = "mobiles")
	public void openFB() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
		driver.quit();

	}
	
	@Test (groups ="socialMedia")
	public void openInsta() {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("instagram"+Keys.ENTER);
		driver.quit();

	}
	
	
	
	
}
