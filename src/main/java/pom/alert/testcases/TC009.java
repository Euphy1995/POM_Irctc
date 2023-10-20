package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify simple alert";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	@Test
	public void simpleAlert() {
		
		new HomePage()
		.switchToTheFrame("iframeResult")
		.clickOnTryit()
		.getTheAlertText()
		.acceptTheAlert()
		.switchToTheHomePage()
		.clickOnTheHomeButton();
		//.closeAllTheBrowsers();
	}
}
