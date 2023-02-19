package org.stepdefinition;

import org.openqa.selenium.By;

import com.baseClass.A_BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_LogIn_Scenario_Outline extends A_BaseClass {

	@Given("user  launch the url for fb")
	public void user_launch_the_url_for_fb() {
		getURL("https://www.facebook.com/");
	}
	@When("user  enter the username{string} and password{string} in the textbox for fb")
	public void user_enter_the_username_vigneshwaran269_and_password_vicky007_in_the_textbox_for_fb(String user, String pass) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	
	}
	@When("user  click the login button for fb")
	public void user_click_the_login_button_for_fb() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Then("user  login into their facebook  page for fb")
	public void user_login_into_their_facebook_page_for_fb() {
		//over("quit");
		System.out.println("login success");
	}

}
