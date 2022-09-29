package com.FirstTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.test.util.TestBase;

public class First_TC1 extends TestBase {

	public HomePage home;
	public RegistrationPage register;

	@BeforeSuite
	public void setup() throws InterruptedException {
		invokeBrowser();
		Thread.sleep(6000);
		System.out.println("welcome");
		home = new HomePage(driver);
		register = new RegistrationPage(driver);
	}

	@Test
	public void verifyIfUserabletoRegisterToWebsite() {

		test = extent.createTest("verify register functionality", "checking register with valid data");
		home.clickRegisterLink();
		test.log(Status.PASS, "clicked onregisterlink successfully");
		register.clickGender();
		test.log(Status.PASS, "clicked on gender male radio successfully");
		register.enterFirstName("hell0");
		test.log(Status.PASS, "clicked on first name successfully");
		register.enterLastName("jarugu");
		test.log(Status.PASS, "clicked on last name successfully");
		register.enterEmailAddress("Hellojarugu392.gmail.com");
		test.log(Status.PASS, "clicked on email successfully");
		register.enterPassword("Welcome");
		test.log(Status.PASS, "clicked on password successfully");
		register.enterConfirmPassword("Welcome");
		test.log(Status.PASS, "clicked on confirm password successfully");
		register.clickRegistrtionButton();

	}
@AfterSuite
public void closeBrowser() {
	extent.flush();
	driver.quit();
}
}
