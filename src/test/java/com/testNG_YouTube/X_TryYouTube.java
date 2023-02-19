package com.testNG_YouTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_TryYouTube {

	@Test
	public void clickVideo() {
		
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//yt-formatted-string[text()='Roadmap for a 3 to 6 years Testing professional | Expected Skills | Tamil']")).click();
	}
	
	
	
}
