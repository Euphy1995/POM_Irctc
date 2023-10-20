package pom.formc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public UserRegistrationPage clickOnSignUpRegistration() {
		clickByXpath(prop.getProperty("HomePage.SignUp.Xpath"));
		return new UserRegistrationPage();
	}
	

}
