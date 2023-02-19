package org.stepdefinition;

import com.baseClass.A_BaseClass;
import com.utility.NewfbPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B_Newfb_Def extends A_BaseClass {

	NewfbPOM s = new NewfbPOM(driver);
	
	

@Given("user can launch the url in the google")
public void user_can_launch_the_url_in_the_google() {
	
getURL("https://www.facebook.com/");
	
}
@When("user can enter their username in the given field for login")
public void user_can_enter_their_username_in_the_given_field_for_login() {
	
	sendKeys(s.getUsername(), "vicky");
	
	
}
@When("user can enter their password in the given field for login")
public void user_can_enter_their_password_in_the_given_field_for_login() {
	
	sendKeys(s.getPassword(), "vvvv");
}
@When("user can click the login button for login")
public void user_can_click_the_login_button_for_login() {
	
	s.getClick().click();
	
}
@Then("user can successfully loged in to facebook")
public void user_can_successfully_loged_in_to_facebook() {
	
	System.out.println("success");
	
}


	
}
