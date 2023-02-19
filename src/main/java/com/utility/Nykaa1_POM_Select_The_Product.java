package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa1_POM_Select_The_Product {

	public static WebDriver driver;

	public Nykaa1_POM_Select_The_Product(WebDriver localdriver) {
		this.driver = localdriver;
		PageFactory.initElements(localdriver, this);
	}

	public WebElement getSkinTab() {
		return skinTab;
	}

	public WebElement getFaceWash() {
		return faceWash;
	}

	public WebElement getNaturalFaceWash() {
		return naturalFaceWash;
	}

	public WebElement getShade() {
		return shade;
	}

	@FindBy(xpath = "(//a[text()='skin'])[2]")
	private WebElement skinTab;

	@FindBy(xpath = "//*[@id=\"my-menu\"]/ul/li[2]/ul/li/div/div[1]/div/ul[2]/li[1]/a")
	private WebElement faceWash;

	@FindBy(xpath = "//div[text()='Nykaa Naturals Face Wash']")
	private WebElement naturalFaceWash;

	@FindBy(xpath = "//select[@title=\"SHADE\"]")
	private WebElement shade;

}
