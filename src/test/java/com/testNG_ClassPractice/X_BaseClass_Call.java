package com.testNG_ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.baseClass.A_BaseClass;

public class X_BaseClass_Call extends A_BaseClass {

	
	@Test
	public void openGoogle() {
		openBrowser("google");
		driver.get("https://demoqa.com/buttons");
		WebElement f4 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		actions(f4, "double click");
		navigateTo("https://www.leafground.com/drag.xhtml;jsessionid=node0oed0acgqg6dic8rbquncl03f22835.node0");
		WebElement f1 = driver.findElement(By.xpath("//div[@data-widget='widget_form_conpnl']"));
		over("quit");
	}
	
	
	
	
	
}
