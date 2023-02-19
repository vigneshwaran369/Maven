package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa4_POM_Add_The_Delivery_Address {

	
	public static  WebDriver driver;
	
	public Nykaa4_POM_Add_The_Delivery_Address(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	
	
	@FindBy(xpath="//p[text()='Add New Address']")
	private WebElement addNewAddress;
	@FindBy(xpath="//input[@placeholder='Pincode']")
	private WebElement pincode;
	@FindBy(xpath="//input[@placeholder='House/ Flat/ Office No.']")
	private WebElement houseNo;
	@FindBy(xpath="//textarea[@placeholder='Road Name/ Area /Colony']")
	private WebElement areaName;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	@FindBy(xpath="//input[@placeholder='Phone']")
	private WebElement phoneNo;
	@FindBy(xpath="//input[@placeholder='Email ID (Optional)']")
	private WebElement emailId;
	@FindBy(xpath="//button[text()='Ship to this address']")
	private WebElement shipToThisAddress;
	
	public WebElement getAddNewAddress() {
		return addNewAddress;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getHouseNo() {
		return houseNo;
	}
	public WebElement getAreaName() {
		return areaName;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getShipToThisAddress() {
		return shipToThisAddress;
	}

	
}
