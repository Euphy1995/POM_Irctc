package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrNewUserSignUpPage extends GenericWrappers{
	
	public FtrNewUserSignUpPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterUserId.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterPwd.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterConfirmPwd.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectSecQuestion(String value) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.SecQuestion.Xpath"), value);
		return this;
	}
	public FtrNewUserSignUpPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.SecAnswer.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage clickOnDobField() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.ClickOnDobField.Xpath"));
		return this;
	}
	public FtrNewUserSignUpPage selectYear(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectYear.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage SelectMonth(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectMonth.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.ClickOnDate.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnGender() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.ClickOnGender.Xpath"));
		return this;
	}
	public FtrNewUserSignUpPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.MaritalStatus.Xpath"));
		return this;
	}
	public FtrNewUserSignUpPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterUserEmail.Xpath"), data);
		return this;	
	}
	public FtrNewUserSignUpPage selectOccupation(String data) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.Occuptaion.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.UserFirstName.Xpath"), data);
		return this;	
	}
	public FtrNewUserSignUpPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.UserMiddleName.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.UserLastName.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectNationality(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.UserNationality.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.FlatNo.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.StreetName.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterArea(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterArea.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectCountry(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectCountry.Xpath"), data);
		return this;
	}
	
	public FtrNewUserSignUpPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.UserMobileNumber.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EnterPincode.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectCity(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectUserCity.Xpath"), data);
		return this;
	}
	
	//public FtrNewUserSignUpPage clickOnCity() {
		//clickByXpath("//select[@id='city']");
		//return this;
	
	public FtrNewUserSignUpPage selectState(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectUserState.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectPostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectUserPostOffice.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage clickonCommAddress() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.CommunicationAddress.Xpath"));
		return this;
	}
	public FtrNewUserSignUpPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficeFlatNo.Xpath"), data);
		return this;		
	}
	public FtrNewUserSignUpPage enterOfficeStreetName(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficeStreetName.Xpath"), data);
		return this;
		}
	public FtrNewUserSignUpPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficeArea.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage SelectOfficeCountry(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficeCountry.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficeMobileNumber.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficePincode.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectOfficeCity(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectOfficeCity.Xpath"), data);
		return this;
	//public FtrNewUserSignUpPage clickOnOfficeCity() {
		//clickByXpath("//select[@id='cityOffice']");
		//return this;
	}

	public FtrNewUserSignUpPage selectOfficeState(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.SelectOfficeState.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage selectOfficePostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OfficePostOffice.Xpath"), data);
		return this;
	}
	public FtrNewUserSignUpPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return this;
	}	
	public FtrNewUserSignUpPage sendTabKeys() {
		sendTab();
		return this;
	}
		
	}
	
	
	

