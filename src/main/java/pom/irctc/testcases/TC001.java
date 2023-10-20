package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="To register new user for irctc";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcRegistration() {
		
		new HomePage()
		.clickOnRegister()
		.enterUserName("Euphy1995")
		.enterPassword("Secret123$")
		.enterConfirmPassword("Secret123$")
		.clickOnPreferredLanguage()
		.clickOnLanguage()
		.clickOnSecQuestion()
		.clickOnQuestion()
		.enterSecAnswer("Charles")
		.clickOnContinue()
		.enterFirstName("Euphrasia")
		.enterMiddleName("Charles")
		.enterLastName("Rayer")
		.clickOnSelectOccupation()
		.clickOnOccupation()
		.clickOnGender()
		.clickOnDob()
		.selectMonth("March")
		.selectYear("1995")
		.clickOnDate("18")
		.clickOnMaritalStatus()
		.selectCountry("India")
		.enterEmailId("euphrasia@gmail.com")
		.enterMobileNo("9444458141")
		.selectNationality("India")
		.clickOnContinue()
		.enterFlatNo("No-20")
		.enterStreetName("Mint Street")
		.enterArea("Adyar")
		.enterPincode("600023")
		.enterState("Tamil Nadu")
		.selectCity("Chennai")
		.selectPostOffice("Aynavaram S.O")
		.enterPhoneNo("26440656")
		.clickOnCopyResidence()
		.enterOffFlatNo("No-6")
		.enterOffStreetName("Halls Street")
		.enterOffArea("Kilpauk")
		.clickOnOffCountry()
		.clickOffCountry()
		.enterOffPincode("600032")
		.enterOffState("Tamil Nadu")
		.enterOffCity("Chennai")
		.enterOffPostOffice("Ekkaduthangal S.O")
		.enterOffPhone("28564756")
		.clickOnCheckBox();
		
	}

}
