package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify confirmation alert using W3School";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
				
	}
	@Test
	public void confirmationAlert() {
		
		new HomePage()
		.switchToTheFrame("iframeResult")
		.clickOnTryit()
		.getTheAlertText()
		.acceptTheAlert()
		.getTextForYouPressedOk()
		.verifyYouPressedOk(AlertPage.txt)
		.refreshThePage()
		.switchToTheFrame("iframeResult")
		.clickOnTryit()
		.getTheAlertText()
		.dismissTheAlert()
		.getTextForCancel()
		.verifyYouPressedCancel(AlertPage.cancel)
		.switchToTheHomePage()
		.clickOnTheHomeButton();
		//.closeAllTheBrowsers();
		
		
		
		
		
		
		
		
		
		
		
	}

}
