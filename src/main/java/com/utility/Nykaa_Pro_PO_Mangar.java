package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_Pro_PO_Mangar {

	public static WebDriver driver;
	private  Nykaa1_POM_Select_The_Product s;
	private Nykaa2_POM_Add_To_Selected_Product_In_The_Bag_ s1;
	private Nykaa3_POM_Sign_In_For_Get_The_Product s2;
	private Nykaa4_POM_Add_The_Delivery_Address s3;
	private Nykaa5_POM_Payment_For_Choosed_Product_And_Take_The_Screenshot_For_Oder_Confimed_Page s4;
	private Nykaa6_POM_Cancel_The_Ordered_Product s5;
	
	public Nykaa_Pro_PO_Mangar(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);	
	}
	
	public Nykaa1_POM_Select_The_Product getS() {
		s= new Nykaa1_POM_Select_The_Product(driver);
		return s;
	}

	public Nykaa2_POM_Add_To_Selected_Product_In_The_Bag_ getS1() {
		s1= new Nykaa2_POM_Add_To_Selected_Product_In_The_Bag_(driver);
		return s1;
	}

	public Nykaa3_POM_Sign_In_For_Get_The_Product getS2() {
		s2=new Nykaa3_POM_Sign_In_For_Get_The_Product(driver);
		return s2;
	}

	public Nykaa4_POM_Add_The_Delivery_Address getS3() {
		s3= new Nykaa4_POM_Add_The_Delivery_Address(driver);
		return s3;
	}

	public Nykaa5_POM_Payment_For_Choosed_Product_And_Take_The_Screenshot_For_Oder_Confimed_Page getS4() {
		s4= new Nykaa5_POM_Payment_For_Choosed_Product_And_Take_The_Screenshot_For_Oder_Confimed_Page(driver);
		return s4;
	}

	public Nykaa6_POM_Cancel_The_Ordered_Product getS5() {
		s5=new Nykaa6_POM_Cancel_The_Ordered_Product(driver);
		return s5;
	}

	
	
	
	
	
}
