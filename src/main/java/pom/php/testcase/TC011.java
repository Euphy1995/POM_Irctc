package pom.php.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify registration in php travels";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.phptravels.org/register.php";
		
	}
	@Test
	public void phpTravels() {
		
		new RegistrationPage()
		.enterFirstName("Euphrasia")
		.enterLastName("Charles")
		.enterEmailId("euphrasia.charles@gmail.com")
		.clickOnCountryCode()
		.clickOnCode()
		.enterPhoneNo("26440656")
		.enterCompanyName("CTS")
		.enterCompanyStreetAddress("ICF")
		.enterStreetAddress("Adyar")
		.enterCity("Chennai")
		.enterState("Tamil Nadu")
		.enterPostcode("600023")
		.selectCountry("IN")
		.enterMobileNo("9952028078")
		.enterPassword("Euphy$123")
		.enterConfirmPassword("Euphy$123");
	}

}
