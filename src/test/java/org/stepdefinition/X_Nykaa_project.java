package org.stepdefinition;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.baseClass.A_BaseClass;
import com.utility.Nykaa_Pro_PO_Mangar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class X_Nykaa_project extends A_BaseClass {
	Nykaa_Pro_PO_Mangar s = new Nykaa_Pro_PO_Mangar(driver);

	@Given("User can launch the Nykaa url")
	public void user_can_launch_the_nykaa_url() {
		getURL("https://www.nykaa.com/");
	}

	@When("user can select the  face wash option  under the skin tab")
	public void user_can_select_the_face_wash_option_under_the_skin_tab() {

		moveToElement(s.getS().getSkinTab(), "move to element");
	}

	@When("user can select the Nykaa Naturals face wash")
	public void user_can_select_the_nykaa_naturals_face_wash() {

		click(s.getS().getFaceWash());

	}

	@Then("user can successfully choose sandlewood and orange peel in the given shade")
	public void user_can_successfully_choose_sandlewood_and_orange_peel_in_the_given_shade() {

		waits();
		try {
			String a = "Buy Cosmetics Products & Beauty Products Online in India at Best Price | Nykaa";

			Set<String> windowHandles = driver.getWindowHandles();
			for (String sv : windowHandles) {
				System.out.println(driver.switchTo().window(sv).getTitle());
			}

			for (String vs : windowHandles) {
				if (vs.equalsIgnoreCase(a)) {
					break;
				}
			}

			click(s.getS().getNaturalFaceWash());
			Set<String> windowHandles1 = driver.getWindowHandles();
			for (String sv : windowHandles1) {
				System.out.println(driver.switchTo().window(sv).getTitle());
			}

			String sss = "Nykaa Naturals Face Wash: Buy Nykaa Naturals Face Wash Online at Best Price in India | Nykaa";
			for (String ss : windowHandles1) {
				if (ss.equalsIgnoreCase(sss)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		click(s.getS().getShade());
		dropDownText(s.getS().getShade(), "Sandalwood & Orange Peel");

	}

	@Given("user can click the Add to bag")
	public void user_can_click_the_add_to_bag() {

		click(s.getS1().getAddToBag());

	}

	@When("user can click the Add to cart icon")
	public void user_can_click_the_add_to_cart_icon() {
		click(s.getS1().getAddBagIcon());
	
	}

	@When("user can select the quantity in the given field")
	public void user_can_select_the_quantity_in_the_given_field() {
		frame(0);
		waits();
		click(s.getS1().getQuantity());
		click(s.getS1().getSelectQuantity());
	}

	@Then("user can successfully click the Proceed button")
	public void user_can_successfully_click_the_proceed_button() {

		click(s.getS1().getProceed());
	}

	@Given("user can click the login  button")
	public void user_can_click_the_login_button() {
		click(s.getS2().getLogIn());
	}

	@When("user can click the Enter the mobile number and enters the mobile number")
	public void user_can_click_the_enter_the_mobile_number_and_enters_the_mobile_number() throws InterruptedException {
		click(s.getS2().getMobileNo());
		sendKeys(s.getS2().getEnterMobileNo(), "8825765659");
	}

	@When("user can click the proceed button and enter the OTP which is received in the given mobile number")
	public void user_can_click_the_proceed_button_and_enter_the_otp_which_is_received_in_the_given_mobile_number() throws InterruptedException {
		//Thread.sleep(6000);
	click(s.getS2().getVerify());
	}

	@Then("user can successfully navigate to the choose address option")
	public void user_can_successfully_navigate_to_the_choose_address_option() {
		System.out.println("user successfully loged in the Nykaa E-commerce");
	}

	@Given("user can click the Add new address")
	public void user_can_click_the_add_new_address() {
		click(s.getS3().getAddNewAddress());
	}

	@When("user can enter the pincode")
	public void user_can_enter_the_pincode() {
		sendKeys(s.getS3().getPincode(), "625708");
	}

	@When("user can enter the House\\/Flat\\/Office No")
	public void user_can_enter_the_house_flat_office_no() throws InterruptedException {
		click(s.getS3().getHouseNo());
		Thread.sleep(4000);
		sendKeys(s.getS3().getHouseNo(), "369A");
	}

	@When("user can enter the Road Name\\/Area\\/Colony")
	public void user_can_enter_the_road_name_area_colony() {
		sendKeys(s.getS3().getAreaName(), "East street");
	}

	@When("user can click the default address")
	public void user_can_click_the_default_address() {
	}

	@When("user can enters the Name, Mobile Number and email id in the given field")
	public void user_can_enters_the_name_mobile_number_and_email_id_in_the_given_field() {
		sendKeys(s.getS3().getName(), "vignesh");
		sendKeys(s.getS3().getPhoneNo(), "8825765659");
		sendKeys(s.getS3().getEmailId(), "nvigneshwaran88@gmail.com");
		
	}

	@Then("user can successfully  click the ship to this address button")
	public void user_can_successfully_click_the_ship_to_this_address_button() {
		click(s.getS3().getShipToThisAddress());
	}

	@Given("user can select the cash on delivery option")
	public void user_can_select_the_cash_on_delivery_option() {
		moveToElement(s.getS4().getCashOndelivery(), "move to element");
		click(s.getS4().getCashOndelivery());
	}

	@When("user can click the place order button")
	public void user_can_click_the_place_order_button() {
		click(s.getS4().getPlaceOrder());
	}

	@Then("user can successfully see the oder confirmation id")
	public void user_can_successfully_see_the_oder_confirmation_id() throws IOException, InterruptedException {
		Thread.sleep(3000);
		screenShot("orderPlaced");
	}

	@Given("user can click the profile icon")
	public void user_can_click_the_profile_icon() {
		click(s.getS5().getInProfile());
		
		
	}

	@When("user can click the my orders for cancel the product")
	public void user_can_click_the_my_orders_for_cancel_the_product() {
		click(s.getS5().getInProfile());
		
	}

	@When("user can click the order details")
	public void user_can_click_the_order_details() {
		frame(0);
		click(s.getS5().getOrderDetails());
		

	}

	@When("user can click the cancel order button")
	public void user_can_click_the_cancel_order_button() {
		frame(0);
		click(s.getS5().getClickButton());
	}

	@When("user can click the reason for cancellation and click the cancel order button")
	public void user_can_click_the_reason_for_cancellation_and_click_the_cancel_order_button() throws IOException, InterruptedException {
		click(s.getS5().getSelectReason());
		click(s.getS5().getOther());
		sendKeys(s.getS5().getComment(), "done by mistake sorry");
		click(s.getS5().getCancelOrder());
		click(s.getS5().getConfirm());
		click(s.getS5().getGotIt());
		Thread.sleep(3000);
		screenShot("cancel");
	}

	@Then("user can successfully cancel the order by clicking the confirm button")
	public void user_can_successfully_cancel_the_order_by_clicking_the_confirm_button() {
		System.out.println("order cancelled successfully");
		
	}

}
