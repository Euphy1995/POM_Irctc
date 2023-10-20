package pom.php.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnCountryCode() {
		clickByXpath(prop.getProperty("RegistrationPage.CountryCode.Xpath"));
		return this;
	}
	public RegistrationPage clickOnCode() {
		clickByXpath(prop.getProperty("RegistrationPage.DialCode.Xpath"));
		return this;
	}
	public RegistrationPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNumber.Xpath"), data);
		return this;
	}
	public RegistrationPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.CompanyName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterCompanyStreetAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ComapnyStreetAddress.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.StreetAddress.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterCity(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.City.Xpath"), data);
		return this;
	}
	public RegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.State.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPostcode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.PostCode.Xpath"), data);
		return this;
	}
	public RegistrationPage selectCountry(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.Country.Xpath"), data);
		return this;
	}
	public RegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNumber.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), data);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
	}
}
