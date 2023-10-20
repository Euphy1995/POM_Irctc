package pom.alert.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;


public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify prompt alert";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
		
	}
	@Test
	public void promptAlert() {
		
		new HomePage()
		.switchToTheFrame("iframeResult")
		.clickOnTryit()
		.sendDataIntoAlert("Euphrasia")
		.getTheAlertText()
		.acceptTheAlert()
		//.verifyName(AlertPage.name)
		.refreshThePage()
		.switchToTheFrame("iframeResult")
		.clickOnTryit()
		.sendDataIntoAlert("Euphrasia")
		.getTheAlertText()
		.dismissTheAlert()
		.getNameIsNotPresentText()
		.verifyNameIsNotPrinted(AlertPage.errorName)
		.switchToTheHomePage()
		.clickOnTheHomeButton();
		//.closeAllTheBrowsers();	
		
		
	}

}
