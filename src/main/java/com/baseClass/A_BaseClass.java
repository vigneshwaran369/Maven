package com.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_BaseClass{
	public static WebDriver driver;
	
	
	

	public static void openBrowser(String name) {
		
		if(name.equals("google")) {
		ChromeOptions chrome = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chrome);
		//driver.manage().window().maximize();
		}else if(name.equals("firefox")) {
			FirefoxOptions fire = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver(fire);
		}
	}
	
	
	public static void openSocialMedia(String mediaName) {
		if(mediaName.equals("twitter")) {
			ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(c);
			driver.get("https://twitter.com/");
		}else if(mediaName.equals("facebook")) {
			ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(c);
			driver.get("https://www.instagram.com/");
		}else if(mediaName.equals("instagram")) {
			ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver(c);
			driver.get("//https://www.facebook.com/");
		}
	}
	
	public static void screenShot(String image) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\NewOne\\Screenshot\\"+image+".png");
		FileUtils.copyFile(source, destination);
	}	
	
	
	
	
	
	
	public static void openSocialMedia1(String browser,String mediaName) {
		
		if(browser.equals("google")) {
			ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(c);
		if(mediaName.equals("twitter")) {
			driver.get("https://twitter.com/");
		}else if(mediaName.equals("instagram")) {
			driver.get("https://www.instagram.com/");
		}else if(mediaName.equals("facebook")) {
			driver.get("//https://www.facebook.com/");
		}
	}
	
	}
	

	public static void getURL(String url) {

		driver.get(url);
	}
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	
	public static void forClick(WebElement s) {
		s.click();
	}
	
	public static void alert(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void navigate(String value) {
		if(value.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}else if (value.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if (value.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
	}
	
	
	public static void robot(String value) throws AWTException {
		Robot r = new Robot();
		if (value.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (value.equalsIgnoreCase("control")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_CONTROL);
		} else if (value.equalsIgnoreCase("shift")) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_SHIFT);
		}
	}
	
	public static void over(String over) {
		
		switch (over) {
		case "close":driver.close();
			break;
		case "quit":driver.quit();
			break;

		}
		
	}
	
	
	public static void actions(WebElement element,String value) { 
		Actions a = new Actions(driver);
		
		if(value.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		}else if(value.equalsIgnoreCase("context click")) {
			a.contextClick(element).build().perform();
		}else if(value.equalsIgnoreCase("double click")) {
			a.doubleClick(element).build().perform();
		}
	}
		
		
	public static void moveToElement(WebElement element, String value) {

		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
		if (value.equalsIgnoreCase("move to element")) {
			a.moveToElement(element).build().perform();
		} else  {
			System.out.println("cannot find");
		}
	}	
	
	public static void moveToElement2(WebElement element,String value,int i,int j) {
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
		if (value.equalsIgnoreCase("move to element 1")) {
			a.moveToElement(element, i, j).build().perform();
		}else {
			System.out.println("cannot find");
		}
		
		
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	
	public static void sendKeys(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	
	public static void dropDownValue(WebElement element,String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);
}
	public static void dropDownText(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static void  dropDownIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		
	}
	
	
	public static void getWindowHandles() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String s :windowHandles ) {
			System.out.println(driver.switchTo().window(s).getTitle());
		}
	}
	
	
	
	public static void waits() {
			driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
	}
	
	public static void frame(int i) {
		driver.switchTo().frame(i);
	}
	
	
	
	
	
	
	
	
	
}