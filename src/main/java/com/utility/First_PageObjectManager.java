package com.utility;

import org.openqa.selenium.WebDriver;

public class First_PageObjectManager {

	public static WebDriver classdriver;
	private First_Page_Object_Model f;

	public First_PageObjectManager(WebDriver localdriver) {
		this.classdriver = localdriver;

	}

	public First_Page_Object_Model getF() {
		f = new First_Page_Object_Model(classdriver);
		return f;
	}

}
