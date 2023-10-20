package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers{
	
	public static String hotelName = null;
	public static String hotelPrice = null;
	
	public HotelDetailsPage getHotelName() {
		hotelName = getTextByXpath(prop.getProperty("HotelDetailsPage.GetHotelName.Xpath"));
		return this;
	}
	public HotelDetailsPage getHotelPrice() {
		hotelPrice=getTextByXpath(prop.getProperty("HotelDetailsPage.GetHotelPrice.Xpath"));
		return this;
	}
	public HotelDetailsPage verifyHotelName(String data) {
		verifyTextByXpath(prop.getProperty("HotelDetailsPage.VerifyHotelName.Xpath"), ""+hotelName);
		return this;
	}
	
	public HotelDetailsPage verifyHotelPrice(String data) {
		verifyTextByXpath(prop.getProperty("HotelDetailsPage.VerifyHotelPrice.Xpath"),""+hotelPrice);
		return this;
		
	}
	public HotelBookingPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("HotelDetailsPage.ClickOnContinueToBook.Xpath"));
		return new HotelBookingPage();
	}
	public HotelDetailsPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}

}
