package pom.formc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers{
	
	public UserRegistrationPage switchToNextWindow() {
		switchToLastWindow();
		return this;
		
	}

	public UserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserPassword.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.ConfirmUserPassword.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectSecQuestion(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.SecurityQuestion.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	
	public UserRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserName.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectGender(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.SelectGender.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterDob(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.DateOfBirth.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Designmation.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserEmailId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserMobileNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.UserPhoneNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectNationality(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.Nationality.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelName.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.Capacity.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterHotelAddress(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelAddress.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectHotelState(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.HotelState.Xpath"), data);
		return this;
	
	}
	public UserRegistrationPage clickOnCity() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("citydata"))).click();
		clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnHotelCity.Xpath"));
		return this;
	}
	public UserRegistrationPage selectCity(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.HotelCity.Xpath"),data);
		return this;
	}
	public UserRegistrationPage selectFrroDescription(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.FrroDescription.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectAccommodationType(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.AccommodationType.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectAccommodationGrade(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.AccommodationGrade.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterHotelEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelEmailId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterHotelMobileNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelMobileNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterHotelPhoneNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelPhoneNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterOwnerName(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.OwnerName.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterOwnerAddress(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.OwnerAddress.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectOwnerState(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.OwnerState.Xpath"), data);
		return this;
	}
	public UserRegistrationPage clickOnOwnerCity() {
		WebDriverWait wt = new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("citydata1"))).click();
		clickByXpath(prop.getProperty("UserRegistrationPage.ClickOnOwnerCity.Xpath"));
		return this;
	}
	public UserRegistrationPage sendTabKey() {
		sendTab();
		return this;
	
	}
	public UserRegistrationPage selectOwnerCity(String data) {
		selectValueByXpath(prop.getProperty("UserRegistrationPage.OwnerCity.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterOwnerEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.OwnerEmailId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterOwnerPhoneNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.OwnerPhoneNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterOwnerMobileNo(String data) {
		enterByXpath(prop.getProperty("UserRegistrationPage.OwnerMobileNo.Xpath"), data);
		return this;
	}
	public UserRegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("UserRegistrationPage.AddDetails.Xpath"));
		return this;
	}
	
	
	
	}

