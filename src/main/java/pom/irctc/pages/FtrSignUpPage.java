package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrSignUpPage extends GenericWrappers{
	
	public FtrNewUserSignUpPage clickOnNewUserSignUp() {
		clickByXpath(prop.getProperty("FtrSignUpPage.SignUp.Xpath"));
		return new FtrNewUserSignUpPage();
			}
	public FtrSignUpPage switchToNextWindow() {
		switchToLastWindow();
		return this;
	}

}
