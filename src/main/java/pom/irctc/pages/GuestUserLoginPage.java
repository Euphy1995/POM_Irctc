package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers{
	
	public GuestUserLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GuestUserLogin.Xpath"));
		return new GuestUserLoginPage();

	}
	public GuestUserLoginPage enterGuestEmailId(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.GuestEmailId.Xpath"),data);
		return this;
	}
	public GuestUserLoginPage enterGuestMobileNo(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.GuestMobileNo.Xpath"), data);
		return this;
	}
	public FindHotelPage clickOnLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GuestLoginButton.Xpath"));
		return new FindHotelPage();
	}

	
	
}
