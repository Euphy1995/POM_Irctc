package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelPaymentPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify GST validation in irctc";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	@Test
	public void BookHotelsGstValidation() {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.clickOnHotelIcon()
		.switchToNextWindow()
		.clickOnLoginLink()
		.clickOnGuestUserLogin()
		.enterGuestEmailId("euphrasia.charles@gmail.com")
		.enterGuestMobileNo("9952028078")
		.clickOnLogin()
		.waitTillThePageLoads()
		.clickOnHotelNameOrCity()
		.enterHotelNameOrCity("Pondicherry")
		.waitTillThePageLoads()
		.clickOnSuggestedHotelNameOrCity()
		.clickOnCheckInField()
		.clickOnCheckInDate("29")
		.clickOnCheckoutField()
		.clickOnCheckOutDate("1")
		.clickOnRoomfield()
		.SelectRoomCount("1")
		.SelectAdultsCount("3")
		//.clickOnDone()
		.clickOnFindHotel()
		.switchToNextWindow()
		.clickOnFirstDisplayedHotel()
		.switchToNextWindow()
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook()
		.switchToNextWindow()
		.selectTitle("3")
		.enterFirstName("Euphrasia")
		.enterLastName("Charles")
		.selectCountry("India")
		.selectState("TN")
		//.enterMobileNo("9952028078")
		//.enterEmailId("euphrasia.charles@gmail.com")
		.selectGst("Yes")
		.enterGst("5463")
		.enterCompanyName("CTS")
		.enterCompanyAddress("Adyar")
		.waitTillTheElementLoads()
		.clickContinue()
		.getGstErrorMsg()
		.verifyGstErrorMsg(HotelPaymentPage.gstError);
		
		//.closeAllTheBrowsers();
	}

}
