package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	
	
	public CharterPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.ClickOnEnquiryForm.Xpath"));
		return this;
	}
	public CharterPage clickOnExitMenuIcon() {
		clickByXpath(prop.getProperty("CharterPage.ExitMenuIcon.Xpath"));
		return this;
	}
	public CharterPage enterName(String data) {
		enterByXpath(prop.getProperty("CharterPage.Uname.Xpath"), data);
		return this;
	}
	public CharterPage enterOrganization(String data) {
		enterByXpath(prop.getProperty("CharterPage.Organization.Xpath"), data);
		return this;
	}
	public CharterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterAddress.Xpath"), data);
		return this;
	}
	public CharterPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterMobileNo.Xpath"), data);
		return this;
	}
	public CharterPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterEmailId.Xpath"), data);
		return this;
	}
	public CharterPage selectRequestFor(String data) {
		selectValueByXpath(prop.getProperty("CharterPage.SelectRequestFor.Xpath"), data);
		return this;
	}
	public CharterPage enterOriginatingStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.OriginStation.Xpath"), data);
		return this;
	}
	public CharterPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.DestinationStation.Xpath"), data);
		return this;
	}
	public CharterPage clickOnDateOfDepartureField() {
		clickByXpath(prop.getProperty("CharterPage.DateOfDepartureField.Xpath"));
		return this;
	}
	public CharterPage clickOnDepartureDate(String date) {
		clickByXpath(prop.getProperty("CharterPage.DepartureDate.Xpath"));
		return this;
	}
	public CharterPage clickOnDateOfArrivalField() {
		clickByXpath(prop.getProperty("CharterPage.DateOfArrivalField.Xpath"));
		return this;
	}
	public CharterPage clickOnArrivalDate(String date) {
		clickByXpath(prop.getProperty("CharterPage.ArrivalDate.Xpath"));
		return this;
	}
	public CharterPage enterDurationOfTour(String data) {
		enterByXpath(prop.getProperty("CharterPage.DurationOfTheTour.Xpath"), data);
		return this;
	}
	public CharterPage enterNoAndTypeOfCoachesReq(String data) {
		enterByXpath(prop.getProperty("CharterPage.CoachDetails.Xpath"), data);
		return this;
	}
	public CharterPage enterNoOfPassengers(String data) {
		enterByXpath(prop.getProperty("CharterPage.NoOfPassengers.Xpath"), data);
		return this;
	}
	public CharterPage enterCharterPurpose(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterPurpose.Xpath"), data);
		return this;
	}
	public CharterPage enterAdditionalServices(String data) {
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.Xpath"), data);
		return this;
	}
	public CharterPage clickOnSubmit() {
		clickByXpath(prop.getProperty("CharterPage.ClickOnSubmit.Xpath"));
		return this;		
	}
	public CharterPage verifyMobileNoNotValidError(String text) {
		verifyTextByXpath(prop.getProperty("CharterPage.VerifyMobileNoNotValid.Xpath"), "Mobile no. not valid");
		return this;
	}
	public CharterPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
