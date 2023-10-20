package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.FirstName.Xpath"), data);
		return this;
	}
	public SignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.LastName.Xpath"), data);
		return this;
	}
	public SignUpPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("SignUpPage.EmailId.Xpath"), data);
		return this;
	}
	public SignUpPage enterConfirmEmailId(String data) {
		enterByXpath(prop.getProperty("SignUpPage.ConfirmEmailId.Xpath"), data);
		return this;
	}
	public SignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Password.Xpath"), data);
		return this;
	}
	public SignUpPage selectDobDay(String data) {
		selectValueByXpath(prop.getProperty("SignUpPage.DobDay.Xpath"), data);
		return this;
	}
	public SignUpPage selectDobMonth(String data) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.DobMonth.Xpath"), data);
	return this;
	}
	public SignUpPage selectDobYear(String data) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.DobYear.Xpath"), data);
		return this;	
	}
	public SignUpPage clickByGender() {
		clickByXpath(prop.getProperty("SignUpPage.Gender.Xpath"));
		return this;
	}
	public SignUpPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return null;
	}
	

}
