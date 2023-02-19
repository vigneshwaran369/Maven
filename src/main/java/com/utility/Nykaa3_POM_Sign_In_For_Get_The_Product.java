package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa3_POM_Sign_In_For_Get_The_Product {
	
	public static WebDriver driver;	
	
	public Nykaa3_POM_Sign_In_For_Get_The_Product(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement logIn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement mobileNo;
	
	@FindBy(name ="emailMobile")
	private WebElement enterMobileNo;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement verify;
	
	public WebElement getLogIn() {
		return logIn;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public WebElement getEnterMobileNo() {
		return enterMobileNo;
	}
	public WebElement getVerify() {
		return verify;
	}
	
	
	
}
