package com.testNG_ClassPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C_BuyMobile {
	
	WebDriver driver;
  @Test
  public void buyTheMobile() {
	  Set<String> w = driver.getWindowHandles();
	  for(String s:w) {
		  System.out.println(driver.switchTo().window(s).getTitle());
	  
	  String s1 = "Vivo Y01 (Sapphire Blue, 2GB RAM, 32GB ROM) with No Cost EMI/Additional Exchange Offers : Amazon.in: Electronics\r\n"
	  		+ "";
	  
	  if(w.contains(s1)) {
		  break;
	  }
	  }
	  driver.findElement(By.name("submit.add-to-cart")).click();
  }
  
  @BeforeMethod
  public void selectTheMobile() {
	  driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("product added to the cart");
  }

  @BeforeClass
  public void searchMobile() {
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vivo mobile"+Keys.ENTER);
	  
  }

  @AfterClass
  public void afterClass() throws IOException {
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File f = ts.getScreenshotAs(OutputType.FILE);
	  File f1 = new File("D:\\Selenium\\Screenshots\\newImage.png");
	  FileHandler.copy(f, f1);
	  
  }

  @BeforeTest
  public void openAmazon() {
	  driver.get("https://www.amazon.in/");
  }

  @AfterTest
  public void u() {
	  System.out.println("screenshot was taken");
	  
  }

  @BeforeSuite
  public void launchTheBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
