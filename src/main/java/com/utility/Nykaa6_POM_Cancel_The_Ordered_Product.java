package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa6_POM_Cancel_The_Ordered_Product {

	public static WebDriver driver;
	
	public Nykaa6_POM_Cancel_The_Ordered_Product(WebDriver locdriver) {
		this.driver=locdriver;
		PageFactory.initElements(locdriver, this);
	}
	
	@FindBy(xpath = "//span[text()='Vigne...']")
	private WebElement profile;
	@FindBy(xpath = "(//a[@class='dropdown-action-item'])[1]")
	private WebElement inProfile;
	@FindBy(xpath = "(//span[text()='Order Details'])[1]")
	private WebElement orderDetails;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement clickButton;
	@FindBy(xpath = "//span[text()='Select reason']")
	private WebElement selectReason;
	@FindBy(xpath = "//div[text()='Other']")
	private WebElement other;
	@FindBy(xpath = "//textarea[@name='comment']")
	private WebElement comment;
	@FindBy(xpath = "//button[text()='Cancel order']")
	private WebElement cancelOrder;
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirm;
	@FindBy(xpath = "//p[text()='Ok, got it!']")
	private WebElement gotIt;
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getInProfile() {
		return inProfile;
	}
	public WebElement getOrderDetails() {
		return orderDetails;
	}
	public WebElement getClickButton() {
		return clickButton;
	}
	public WebElement getSelectReason() {
		return selectReason;
	}
	public WebElement getOther() {
		return other;
	}
	public WebElement getComment() {
		return comment;
	}
	public WebElement getCancelOrder() {
		return cancelOrder;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getGotIt() {
		return gotIt;
	}

	
}
