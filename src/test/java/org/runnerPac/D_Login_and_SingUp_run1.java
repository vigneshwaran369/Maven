package org.runnerPac;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseClass.A_BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\NewOne\\src\\test\\java\\org\\feature\\LogIn_and_Signup.feature",glue="org.stepdefinition")
public class D_Login_and_SingUp_run1 extends A_BaseClass {

	@BeforeClass
	public static void login() {
		openBrowser("google");
	}
	
}
