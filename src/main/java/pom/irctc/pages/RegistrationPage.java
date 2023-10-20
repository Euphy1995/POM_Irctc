package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.RegisterName.Xpath"), data);
	return this;
	}
	public RegistrationPage enterPassword(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.UserPwd.Xpath"), data);
	return this;
	}
	public RegistrationPage enterConfirmPassword(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.ConfirmUserPwd.Xpath"), data);
	return this;
	}
	public RegistrationPage clickOnPreferredLanguage() {
	clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.Xpath"));
	return this;
	}
	public RegistrationPage clickOnLanguage() {
	clickByXpath(prop.getProperty("RegistrationPage.Language.Xpath"));
	return this;
	}
	public RegistrationPage clickOnSecQuestion() {
	clickByXpath(prop.getProperty("RegistrationPage.RegSecurityQuestion.Xpath"));
	return this;
	}
	public RegistrationPage clickOnQuestion() {
	clickByXpath(prop.getProperty("RegistrationPage.Question.Xpath"));
	return this;
	}
	public RegistrationPage enterSecAnswer(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.RegSecurityAnswer.Xpath"), data);
	return this;
	}
	public RegistrationPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.RegContinue.Xpath"));
		return this;
	}
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegFirstName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegMiddleName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegLastName.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnSelectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.Xpath"));
		return this;
	}
	public RegistrationPage clickOnOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.ClickOnOccupation.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnDob() {
		clickByXpath(prop.getProperty("RegistrationPage.RegDob.Xpath"));
		return this;
	}
	public RegistrationPage selectMonth(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegMonth.Xpath"), data);
		return this;
	}
	public RegistrationPage selectYear(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegYear.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("RegistrationPage.RegDate.Xpath"));
	return this;
	}
	public RegistrationPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("RegistrationPage.RegMaritalStatus.Xpath"));
		return this;
	}
	
	public RegistrationPage selectCountry(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegCountry.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegistrationPage.RegGender.Xpath"));
		return this;
	}
	public RegistrationPage enterEmailId(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.RegEmailId.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegMobileNo.Xpath"), data);
		return this;
		
	}
	public RegistrationPage selectNationality(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegNationality.Xpath"), data);
		return this;
	}
	public RegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegAddress.Xpath"), data);
		return this;
	}
	public RegistrationPage enterStreetName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegStreetName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegArea.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegPincode.Xpath"), data);
		return this;
	}
	public RegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegState.Xpath"), data);
		return this;
	}
	public RegistrationPage selectCity(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegCity.Xpath"), data);
		return this;
	}
	
	public RegistrationPage selectPostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegPostOff.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegPhone.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnCopyResidence() {
		clickByXpath(prop.getProperty("RegistrationPage.CopyResidence.Xpath"));
		return this;
	}
	
	public RegistrationPage enterOffFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOfficeFlatNo.Xpath"), data);
		return this;
	}
	public RegistrationPage enterOffStreetName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffStreetName.Xpath"), data);
		return this;
		
	}
	public RegistrationPage enterOffArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffArea.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnOffCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.RegClickOnOffCountry.Xpath"));
		return this;
	}
	public RegistrationPage clickOffCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.RegclickOffCountry.Xpath"));
		return this;
	}
	public RegistrationPage enterOffPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffPincode.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOffState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffState.Xpath"), data);
		return this;
	}
	/*public RegistrationPage selectOffCity(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegOffCity.Xpath"), data);
		return this;
	}*/
	public RegistrationPage enterOffCity(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffCity.Xpath"), data);
		return this;
	}
	
	/*public RegistrationPage selectOffPostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.RegOffPostOffice.Xpath"), data);
		return this;
	}*/
	public RegistrationPage enterOffPostOffice(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffPostOffice.Xpath"), data);
		return this;
	}
	public RegistrationPage enterOffPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RegOffPhone.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnCheckBox() {
		clickByXpath(prop.getProperty("RegistrationPage.RegCheckBox.Xpath"));
		return this;
	}
	public RegistrationPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return null;
	}
	} 












	


