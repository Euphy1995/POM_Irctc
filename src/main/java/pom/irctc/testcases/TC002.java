package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To book the coach in irctc";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	@Test
	public void irctcBookYourCoach() {
		
		
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoachOrTrain()
		.switchToNextWindow()
		.clickOnNewUserSignUp()
		.enterUserId("Euphy95")
		.enterPassword("Euphy1234")
		.enterConfirmPassword("Euphy1234")
		.selectSecQuestion("3")
		.enterSecAnswer("Music")
		.clickOnDobField()
		.SelectMonth("Mar")
		.selectYear("1995")
		.clickOnDate("18")
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmailId("euphrasia@gmail.com")
		.selectOccupation("Public")
		.enterFirstName("Euphy")
		.enterMiddleName("Rayer")
		.enterLastName("Charles")
		.selectNationality("Indian")
		.enterFlatNo("No-10")
		.enterStreet("Hill Street")
		.enterArea("TNagar")
		.selectCountry("India")
		.enterMobile("9952028078")
		.enterPincode("600023")
		.sendTabKeys()
		.selectCity("Chennai")
		//.sendTabKeys()
		.selectState("TAMIL NADU")
		.selectPostOffice("Aynavaram S.O")
		.clickonCommAddress()
		.enterOfficeFlatNo("No-20")
		.enterOfficeStreetName("Mount Road")
		.enterOfficeArea("Adyar")
		.SelectOfficeCountry("India")
		.enterOfficeMobile("9952028078")
		.enterOfficePincode("600023")
		.sendTabKeys()
		.selectOfficeCity("Chennai")
		.sendTabKeys()
		.selectOfficeState("TAMIL NADU")
		.sendTabKeys()
		.selectOfficePostOffice("Aynavaram S.O");
		
	}

}
