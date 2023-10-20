package pom.irctc.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;
import wrappers.Wrappers;

public class FindHotelPage extends GenericWrappers{
	
	public FindHotelPage clickOnHotelNameOrCity() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.attributeContains(By.id("filterText"), "id", "filterText"));
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnHotelNameOrCity.Xpath"));
		return this;
	
	}
	public FindHotelPage enterHotelNameOrCity(String data) {
		enterByXpath(prop.getProperty("FindHotelPage.EnterHotelNameOrCity.Xpath"), data);
		return this;
		}
	public FindHotelPage clickOnSuggestedHotelNameOrCity() {
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnSuggestedHotelNameOrCity.Xpath"));
		return this;
	}
	
	public FindHotelPage clickOnCheckInField() {
		clickByXpath(prop.getProperty("FindHotelPage.CheckInDateField.Xpath"));
		return this;
	}
		public FindHotelPage clickOnCheckInDate(String date) {
		clickByXpath(prop.getProperty("FindHotelPage.CheckInDate.Xpath"));
		return this;
	}
	public FindHotelPage clickOnCheckoutField() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.attributeContains(By.name("dt13"), "name", "dt13"));
		clickByXpath(prop.getProperty("FindHotelPage.CheckOutDateField.Xpath"));
		return this;
	}
		public FindHotelPage clickOnCheckOutDate(String date) {
		clickByXpath(prop.getProperty("FindHotelPage.CheckOutDate.Xpath"));
		return this;	
	}
	public FindHotelPage clickOnRoomfield() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.attributeContains(By.name("guest"), "name", "guest"));
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnRoomField.Xpath"));
		return this;
	}
	public FindHotelPage SelectRoomCount(String data) {
		selectValueByXpath(prop.getProperty("FindHotelPage.RoomCount.Xpath"),data);
		return this;
		
	}
	public FindHotelPage SelectAdultsCount(String data) {
		selectValueByXpath(prop.getProperty("FindHotelPage.AdultCount.Xpath"), data);
		return this;
	}
	public FindHotelPage mouseHoverOnDone() {
		mouseHoverByXpath(prop.getProperty("FindHotelPage.MouseHoverOnDone.Xpath"));
		return this;
	}
	public FindHotelPage clickOnDone() {
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnDone.Xpath"));
		return this;
	}
	public HotelListPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnFindHotel.Xpath"));
		return new HotelListPage();
	}
	public FindHotelPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}
	public GuestUserLoginPage clickOnLoginLink() {
		clickByXpath(prop.getProperty("FindHotelPage.ClickOnLoginLink.Xpath"));
		return new GuestUserLoginPage();
	}
	public FindHotelPage waitTillThePageLoads() {
		waitproperty(5000);
		return this;
	}
	
}