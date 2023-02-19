package org.stepdefinition;

import org.openqa.selenium.By;

import com.baseClass.A_BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Login_Scenario_Def extends A_BaseClass {

	@Given("user  launch the url")
	public void user_launch_the_url() {
		getURL("https://www.facebook.com/");

	}

	@When("user  enter the username and password in the textbox")
	public void user_enter_the_username_and_password_in_the_textbox() {

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vigneshwaran369");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("878347fddf");
	}

	@When("user  click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	@Then("user  login into their facebook page")
	public void user_login_into_their_facebook_page() {
		over("quit");
		System.out.println("login success");
	}

}
