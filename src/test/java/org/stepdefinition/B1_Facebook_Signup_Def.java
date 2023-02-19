package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.baseClass.A_BaseClass;
import com.utility.Facebook_Signup_Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B1_Facebook_Signup_Def extends A_BaseClass {

	Facebook_Signup_Pom s = new Facebook_Signup_Pom(driver);

	@Given("user can launch the facebook url")
	public void user_can_launch_the_facebook_url() {
		getURL("https://www.facebook.com/");
	}

	@When("user can click the create my account button")
	public void user_can_click_the_create_my_account_button() {
		click(s.getCreateAcc());
	}

	@When("user can enters the first name and last name in the given field")
	public void user_can_enters_the_first_name_and_last_name_in_the_given_field() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		sendKeys(s.getFirstName(), "vicky");
		sendKeys(s.getSurName(), "vignesh");
	}

	@When("user can enters either mobile or email address")
	public void user_can_enters_either_mobile_or_email_address() {
		sendKeys(s.getMobileNo(), "8825765655");
	}

	@When("user can set the password for security purpose")
	public void user_can_set_the_password_for_security_purpose() {
		sendKeys(s.getPassword(), "vicky007");
	}

	@When("user can choose their date of birth")
	public void user_can_choose_their_date_of_birth() {
		dropDownText(s.getDate(), "10");
		dropDownIndex(s.getMonth(), 0);
		dropDownValue(s.getYear(), "1998");
	}

	@When("user can select their gender")
	public void user_can_select_their_gender() {
		s.getGender().click();
	}

	@When("user can click the sign up button")
	public void user_can_click_the_sign_up_button() {
		click(s.getSignUp());
	}

	@Then("user can succussfully create the account in facebook")
	public void user_can_succussfully_create_the_account_in_facebook() {
		over("close");
		System.out.println("Now user can access facebook");
	}

}
