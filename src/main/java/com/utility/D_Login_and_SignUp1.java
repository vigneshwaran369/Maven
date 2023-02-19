package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_Login_and_SignUp1 {
	public static WebDriver cdriver;
		
		
		public D_Login_and_SignUp1(WebDriver locdriver) {
			
			this.cdriver= locdriver;
			PageFactory.initElements(locdriver, this);
		
		}
		
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement username;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
	
		
		
		
		public WebElement getUsername() {
			return username;
		}
	
		public WebElement getPassword() {
			return password;
		}
		

	
	
}
