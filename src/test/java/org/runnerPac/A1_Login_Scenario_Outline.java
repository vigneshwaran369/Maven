package org.runnerPac;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\NewOne\\src\\test\\java\\org\\feature\\A1_login_ScenarioOutline.feature",glue="org.stepdefinition")

public class A1_Login_Scenario_Outline {

	
	
	@BeforeClass
	public static void launchBrowser() {
		
		
		
	}
	
}
