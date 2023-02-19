package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page_Object_Model {

	
	
	public static WebDriver cdriver;
	
	public First_Page_Object_Model(WebDriver localdriver) {

		this.cdriver = localdriver;
		PageFactory.initElements(localdriver, this);
		
	}
	
	
	
	@FindBy(xpath ="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement username;

	@FindBy(xpath = "//button[@name='login']")
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
