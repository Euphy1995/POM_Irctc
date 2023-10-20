package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public RegistrationPage clickOnRegister() {
	clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
	return new RegistrationPage();
		}
	public HomePage mouseHoverOnHolidays() {
	mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverOnHolidays.Xpath"));
	return this;
	}
	public HomePage mouseHoverOnStays() {
	mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverOnStays.Xpath"));
	return this;
		}
	public AccommodationPage clickOnLounge() {
	clickByXpath(prop.getProperty("HomePage.ClickOnLounge.Xpath"));
	return new AccommodationPage();
			
	}
	
}
