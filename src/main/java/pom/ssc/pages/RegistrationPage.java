package pom.ssc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage clickonAadhar() {
		clickByXpath(prop.getProperty("RegistrationPage.Aadhar.Xpath"));
		return this;
	}
	
	public RegistrationPage enterAadharNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.AadharNo.Xpath"), data);
		return this;
	}
	public RegistrationPage enterConfirmAadharNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmAadharNo.Xpath"), data);
		return this;
	}
	public RegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Name.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyName.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnNameChange() {
		clickByXpath(prop.getProperty("RegistrationPage.NameChange.Xpath"));
		return this;
	}
	public RegistrationPage enterNewName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.NewName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterFatherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FatherName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyFatherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyFatherName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterMotherName(String date) {
		enterByXpath(prop.getProperty("RegistrationPage.MotherName.Xpath"), date);
		return this;
	}
	public RegistrationPage enterVerifyMotherName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyMotherName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterDob(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.DateOfBirth.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyDob(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyDateOfBirth.Xpath"), data);
		return this;
	}
	public RegistrationPage selectEducationBoard(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.EducationBoard.Xpath"), data);
		return this;
	}
	public RegistrationPage selectVerifyEducationBoard(String data) {
	 selectValueByXpath(prop.getProperty("RegistrationPage.VerifyEducationBoard.Xpath"), data);
	return this; 
		
	}
	public RegistrationPage enterRollNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.RollNumber.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyRollNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyRollNumber.Xpath"), data);
		return this;
	}
	public RegistrationPage selectYearOfPassing(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.YearOfPassing.Xpath"), data);
		return this;
	}
	public RegistrationPage selectVerifyYearOfPassing(String data) {
		selectValueByXpath(prop.getProperty("RegistrationPage.VerifyYearOfPassing.Xpath"), data);
		return this;
	}
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.Xpath"));
		return this;
	}
	public RegistrationPage clickOnVerifyGender() {
		clickByXpath(prop.getProperty("RegistrationPage.VerifyGender.Xpath"));
		return this;
	}
	public RegistrationPage selectLevelOfEduQualification(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.LevelOfEducationQualification"), data);
		return this;
	}
	public RegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyMobileNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyMobileNo.Xpath"), data);
		return this;
	}
	public RegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.Xpath"), data);
		return this;
	}
	public RegistrationPage enterVerifyEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.VerifyEmail.Xpath"), data);
		return this;
	}
	public RegistrationPage selectState(String data) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OriginState.Xpath"), data);
		return this;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
