package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class D_LogIn_and_SignUp2_PageObjectManger {

	public static WebDriver driver;
	private D_Login_and_SignUp1 s;
	private Facebook_Signup_Pom v;
	
	public D_LogIn_and_SignUp2_PageObjectManger(WebDriver localdriver) {
		
		this.driver= localdriver;
		PageFactory.initElements(localdriver, this);
	}

	
	public D_Login_and_SignUp1 getS() {
		s=new D_Login_and_SignUp1(driver);
		return s;
	}


	public Facebook_Signup_Pom getV() {
		v= new Facebook_Signup_Pom(driver);
		return v;
	}
	
	
	
	
}
