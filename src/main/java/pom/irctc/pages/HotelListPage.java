package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{
	
	public HotelDetailsPage clickOnFirstDisplayedHotel() {
		clickByXpath(prop.getProperty("HotelListPage.ClickOnFirstDisplayedHotel.Xpath"));
		return new HotelDetailsPage();
	}
	public HotelListPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}
	
}

