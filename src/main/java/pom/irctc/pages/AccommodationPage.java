package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.MenuIcon.Xpath"));
		return this;
	
	}
	public FtrSignUpPage clickOnBookYourCoachOrTrain() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoachOrTrain.Xpath"));
		return new FtrSignUpPage();
		}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.ClickOnCharter.Xpath"));
		return new CharterPage();
	}
	public AccommodationPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}
	public FindHotelPage clickOnHotelIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.HotelIcon.Xpath"));
		return new FindHotelPage();
	}
	
	
}
