package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.baseClass.A_BaseClass;
import com.utility.D_LogIn_and_SignUp2_PageObjectManger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D_LogIn_and_SingUp_Def1 extends A_BaseClass{
	public static D_LogIn_and_SignUp2_PageObjectManger s = new D_LogIn_and_SignUp2_PageObjectManger(driver);
	public static D_LogIn_and_SignUp2_PageObjectManger v= new D_LogIn_and_SignUp2_PageObjectManger(driver);


@Given("user can launch the url in the google fs")
public void user_can_launch_the_url_in_the_google_fs() {
	getURL("https://www.facebook.com/");
}

@When("user can enter their username in the given field for login  fs")
public void user_can_enter_their_username_in_the_given_field_for_login_fs() {
	sendKeys(s.getS().getUsername(), "vickysneha");
}

@When("user can enter their password in the given field for login fs")
public void user_can_enter_their_password_in_the_given_field_for_login_fs() {
	sendKeys(s.getS().getPassword(), "vickycic");
}

@When("user can click the login button for login fs")
public void user_can_click_the_login_button_for_login_fs() {
	System.out.println("success");
}

@Then("user can successfully loged in to facebook  fs")
public void user_can_successfully_loged_in_to_facebook_fs() {
	System.out.println("success");
}

@Given("user can launch the facebook url fs")
public void user_can_launch_the_facebook_url_fs() {
	System.out.println("success");
}

@When("user can click the create my account button fs")
public void user_can_click_the_create_my_account_button_fs() {
	click(s.getV().getCreateAcc());

}

@When("user can enters the first name and last name in the given field fs")
public void user_can_enters_the_first_name_and_last_name_in_the_given_field_fs() {
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	sendKeys(v.getV().getFirstName(), "vicky");
	sendKeys(v.getV().getSurName(), "vignesh");

}

@When("user can enters either mobile or email address fs")
public void user_can_enters_either_mobile_or_email_address_fs() {
	sendKeys(v.getV().getMobileNo(),"9876543210");
}

@When("user can set the password for security purpose fs")
public void user_can_set_the_password_for_security_purpose_fs() {
	sendKeys(v.getV().getPassword(), "vickckkk");
}

@When("user can choose their date of birth fs")
public void user_can_choose_their_date_of_birth_fs() {
	dropDownText(v.getV().getDate(), "10");
	dropDownIndex(v.getV().getMonth(), 0);
	dropDownValue(v.getV().getYear(), "1998");
}

@When("user can select their gender fs")
public void user_can_select_their_gender_fs() {
	click(v.getV().getGender());	
}

@When("user can click the sign up button fs")
public void user_can_click_the_sign_up_button_fs() {
	click(v.getV().getSignUp());
}

@Then("user can succussfully create the account in facebook fs")
public void user_can_succussfully_create_the_account_in_facebook_fs() {
	System.out.println("success");
}

	
}
