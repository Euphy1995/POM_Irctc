package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers{
	

	public HotelBookingPage selectTitle(String data) {
		selectValueByXpath(prop.getProperty("HotelBookingPage.Title.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.GuestFirstName.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterLastName(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.GuestLastName.Xpath"), data);
		return this;
	}
	
	public HotelBookingPage selectCountry(String data) {
		selectVisibleTextByXpath(prop.getProperty("HotelBookingPage.GuestCountry.Xpath"), data);
		return this;
	}
	
	public HotelBookingPage selectState(String data) {
		selectValueByXpath(prop.getProperty("HotelBookingPage.GuestState.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.GuestMobileNum.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.GuestEmailId.Xpath"), data);
		return this;
	}
	public HotelBookingPage selectGst(String data) {
		selectValueByXpath(prop.getProperty("HotelBookingPage.Gst.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterGst(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.GstNumber.Xpath"), data);
		return this;
	}
	public HotelBookingPage mouseHoverOnContinue() {
		mouseHoverByXpath(prop.getProperty("HotelBookingPage.MouseHoverOnContinue.Xpath"));
		return this;
	}
	public HotelPaymentPage clickContinue() {
		clickByXpath(prop.getProperty("HotelBookingPage.ClickContinue.Xpath"));
		return new HotelPaymentPage();
	}
	
	public HotelBookingPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.CompanyName.Xpath"), data);
		return this;
	}
	public HotelBookingPage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("HotelBookingPage.CompanyAddress.Xpath"), data);
		return this;
	}
	public HotelBookingPage getGstErrorMsg() {
		getTextByXpath(prop.getProperty("HotelBookingPage.GstError.Xpath"));
		return this;
	}
	public HotelBookingPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelBookingPage waitTillTheElementLoads() {
		waitproperty(5000);
		return this;

}
}