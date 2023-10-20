package pom.alert.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public AlertPage switchToTheFrame(String data) {
		switchToFrame(data);
		return new AlertPage();
	}
	public HomePage clickOnTheHomeButton() {
		clickByXpath(prop.getProperty("HomePage.HomeButton.Xpath"));
		return this;
	}
}

