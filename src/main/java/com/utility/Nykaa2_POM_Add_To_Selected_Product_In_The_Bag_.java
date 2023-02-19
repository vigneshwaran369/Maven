package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa2_POM_Add_To_Selected_Product_In_The_Bag_ {

	public static WebDriver driver;
	
	public Nykaa2_POM_Add_To_Selected_Product_In_The_Bag_(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
		
	}
	
	public WebElement getAddToBag() {
		return addToBag;
	}

	public WebElement getAddBagIcon() {
		return addBagIcon;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSelectQuantity() {
		return selectQuantity;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(xpath="(//span[text()='Add to Bag'])[1]")
	private WebElement addToBag;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement addBagIcon;
	
	@FindBy(xpath="//p[text()='Quantity : 1']")
	private WebElement quantity;
	
	@FindBy(xpath="(//div[@label='5'])[1]")
	private WebElement selectQuantity;
	
	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceed;
	

}
