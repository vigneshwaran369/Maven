package org.runnerPac;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseClass.A_BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\NewOne\\src\\test\\java\\org\\feature\\A_LogIn_ScenarioOutline.feature",glue="org.stepdefinition")
public class A_LogInScenario_run extends A_BaseClass{

	@BeforeClass
	public static void loginScenario_Outline() {
		openBrowser("google");
	}
	
}
