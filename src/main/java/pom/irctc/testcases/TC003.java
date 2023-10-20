package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pom.irctc.pages.CharterPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="Saloon Charter";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	@Test
	public void irctcSaloonCharter() {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.clickOnExitMenuIcon()
		.enterName("Euphrasia")
		.enterOrganization("CTS")
		.enterAddress("Adyar")
		.enterMobileNo("9952028")
		.enterEmailId("euphrasia.charles@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation("Chennai")
		.enterDestinationStation("Bangalore")
		.clickOnDateOfDepartureField()
		.clickOnDepartureDate("23")
		.clickOnDateOfArrivalField()
		.clickOnArrivalDate("29")
		.enterDurationOfTour("5 Days")
		.enterNoAndTypeOfCoachesReq("No:2345 AC berth")
		.enterNoOfPassengers("15")
		.enterCharterPurpose("Providecourteousandefficientcounterservices")
		.enterAdditionalServices("Bed-rolls")
		.clickOnSubmit()
		.verifyMobileNoNotValidError("Mobile no. not valid");
		//.closeAllTheBrowsers();
		
	}

}
