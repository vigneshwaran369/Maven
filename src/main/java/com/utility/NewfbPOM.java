package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewfbPOM {

	public static WebDriver cdriver;
	
	
	public NewfbPOM(WebDriver locdriver) {
		
		this.cdriver= locdriver;
		PageFactory.initElements(locdriver, this);
	
	}
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	


	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement click;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getClick() {
		return click;
	}
	
	
	
	
}
