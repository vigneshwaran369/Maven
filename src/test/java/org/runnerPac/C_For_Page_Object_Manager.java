package org.runnerPac;

import com.baseClass.A_BaseClass;
import com.utility.First_PageObjectManager;

public class C_For_Page_Object_Manager extends A_BaseClass {

	public static void main(String[] args) {

		openBrowser("google");
		getURL("https://www.facebook.com/");
		First_PageObjectManager s = new First_PageObjectManager(driver);
		sendKeys(s.getF().getUsername(), "vicky");
		sendKeys(s.getF().getPassword(), "vickysneha");
		click(s.getF().getClick());

	}

}
