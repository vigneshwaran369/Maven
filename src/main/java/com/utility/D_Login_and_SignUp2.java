package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_Login_and_SignUp2 {

	public static WebDriver cdriver;

	public D_Login_and_SignUp2(WebDriver localdriver) {
		this.cdriver = localdriver;
		PageFactory.initElements(localdriver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createAcc;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstName;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement surName;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobileNo;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	@FindBy(xpath = "//select[@title='Day']")
	private WebElement date;
	@FindBy(xpath = "//select[@title='Month']")
	private WebElement month;
	@FindBy(xpath = "//select[@title='Year']")
	private WebElement year;
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement gender;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signUp;

	public WebElement getCreateAcc() {
		return createAcc;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignUp() {
		return signUp;
	}

}
