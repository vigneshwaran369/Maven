package org.runnerPac;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseClass.A_BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\NewOne\\src\\test\\java\\org\\feature\\Nykaa_Project.feature",glue="org.stepdefinition")
public class X_Nykaa_Project extends A_BaseClass{

	
	
	@BeforeClass
	public static void nykaa() {
		openBrowser("google");
	}
	
	
}
