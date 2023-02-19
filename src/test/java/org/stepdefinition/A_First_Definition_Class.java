package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseClass.A_BaseClass;
import com.utility.First_Page_Object_Model;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_First_Definition_Class extends A_BaseClass {
	
	

	First_Page_Object_Model f = new First_Page_Object_Model(driver);
	
	
	@Given("user can launch the url")
	public void user_can_launch_the_url() {
		getURL("https://www.facebook.com/");

	}
	
	
	
	

	@When("user can enter the username{string} and password{string} in the textbox")
	public void user_can_enter_the_username_username_and_password_password_in_the_textbox(String username,String password) {

		

		f.getUsername().sendKeys(username);
		f.getPassword().sendKeys(password);
		
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

}



	
	
	
	
//
//	@When("user can enter the username and password in the textbox")
//	public void user_can_enter_the_username_and_password_in_the_textbox() {
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vigneshwaran369");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("878347fddf");

//	}

	@When("user can click the login button")
	public void user_can_click_the_login_button() {
		
	
	     f.getClick();
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("user can login into their facebook page")
	public void user_can_login_into_their_facebook_page() {
		System.out.println("login success");
		//over("quit");

	}

}
