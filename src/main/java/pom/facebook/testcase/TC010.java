package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC010";
		testCaseDescription="To verify new user sign up for facebook application";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https:www.facebook.com";
		
	}
	
	@Test
	public void fb() {
		
		new HomePage()
		.clickOnCreateNewAccount()
		.enterFirstName("Euphy")
		.enterLastName("Charles")
		.enterEmailId("euphrasia.charles@gmail.com")
		.enterConfirmEmailId("euphrasia.charles@gmail.com")
		.enterPassword("Euphrasia1995")
		.selectDobDay("18")
		.selectDobMonth("Mar")
		.selectDobYear("1995")
		.clickByGender();
	}

}
