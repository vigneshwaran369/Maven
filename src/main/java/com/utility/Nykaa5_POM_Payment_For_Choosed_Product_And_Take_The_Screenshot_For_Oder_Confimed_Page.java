package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa5_POM_Payment_For_Choosed_Product_And_Take_The_Screenshot_For_Oder_Confimed_Page {

	
	public static WebDriver driver;
	
	public Nykaa5_POM_Payment_For_Choosed_Product_And_Take_The_Screenshot_For_Oder_Confimed_Page(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	

	@FindBy(xpath = "//p[text()='Cash on delivery']")
	private WebElement cashOndelivery;
	
	@FindBy(xpath = "//button[text()='Place order']")
	private WebElement placeOrder;
	
	public WebElement getCashOndelivery() {
		return cashOndelivery;
	}
	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	
		
		
		
		
		
	}
	

