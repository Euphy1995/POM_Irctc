package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pom.irctc.pages.GuestUserLoginPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.HotelDetailsPage;
import pom.irctc.pages.OtpPage;
import wrappers.ProjectWrappers;


public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify otp validation of hotel booking in irctc";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	@Test
	public void bookHotelsOtpValidataion() {
		
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
		//.mouseHoverOnDone()
		//.clickOnDone()
		.clickOnFindHotel()
		.switchToNextWindow()
		.clickOnFirstDisplayedHotel()
		.switchToNextWindow()
		.getHotelName()
		.getHotelPrice()
		.verifyHotelName(HotelDetailsPage.hotelName)
		.verifyHotelPrice(HotelDetailsPage.hotelPrice)
		.clickOnContinueToBook()
		.switchToNextWindow()
		.selectTitle("3")
		.enterFirstName("Euphrasia")
		.enterLastName("Charles")
		.selectCountry("India")
		.selectState("TN")
		//.enterMobileNo("9500178262")
		//.enterEmailId("charles@gmail.com")
		.selectGst("No")
		.clickContinue()
		.clickOnCheckBox()
		.clickOnMakePayment()
		.mouseHoverOnVerify()
		.clickOnVerifyOtp()
		.getErrorText()
		.verifyOtpErrorMsg(OtpPage.error);
		//.closeAllTheBrowsers();	
	}
}
