package pom.alert.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.irctc.pages.HotelBookingPage;
import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers{
	
	public static String errorName,txt,cancel = null;
	
	public AlertPage sendDataIntoAlert(String data) {
		sendAlertKeys(data);
		return this;
	}
	public AlertPage clickOnTryit() {
		clickByXpathNoSnap(prop.getProperty("AlertPage.TryItButton.Xpath"));
		return this;
	}
	public AlertPage getTheAlertText() {
		getAlertText();
		return this;
	}
	public AlertPage waitTillTheElementLoads() {
		waitproperty(5000);
		return this;
	}
	public AlertPage acceptTheAlert() {
		acceptAlert();
		return this;
	}
	public AlertPage dismissTheAlert() {
	dismissAlert();
	return this;
		}
	public HomePage refreshThePage() {
		refresh();
		return new HomePage();
	}
	public AlertPage getNameIsNotPresentText() {
		errorName=getTextByXpath(prop.getProperty("AlertPage.NameNotPresent.Xpath"));
		return this;
	}

	public AlertPage verifyNameIsNotPrinted(String data) {
		verifyTextByXpath(prop.getProperty("AlertPage.VerifyName.Xpath"), ""+errorName);
		return this;
	
	}
	public AlertPage verifyYouPressedOk(String data) {
		verifyTextByXpath(prop.getProperty("AlertPage.VerifyYouPressedOk.Xpath"), ""+txt);
		return this;
	}
	public AlertPage getTextForYouPressedOk() {
		txt = getTextByXpath(prop.getProperty("AlertPage.GetTextForYouPressedOk.Xpath"));
		return this;
	}
	public AlertPage verifyYouPressedCancel(String data) {
		verifyTextByXpath(prop.getProperty("AlertPage.VerifyYouPressedCancel.Xpath"), ""+cancel);
		return this;
	}
	public AlertPage getTextForCancel() {
		cancel = getTextByXpath(prop.getProperty("AlertPage.getTextForYouPressedCancel.Xpath"));
		return this;
	}
	public HomePage switchToTheHomePage() {
		switchToDefaultContent();
		return new HomePage();
	
	}
	

	

}
