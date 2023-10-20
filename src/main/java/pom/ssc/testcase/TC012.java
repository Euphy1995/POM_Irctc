package pom.ssc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC012";
		testCaseDescription="To register in ssc registration";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://ssc.nic.in/registration/home";
		
	}
	@Test
	public void sscRegistration() {
		
		new RegistrationPage()
		.clickonAadhar()
		.enterAadharNo("435678304812")
		.enterConfirmAadharNo("435678304812")
		.enterName("Euphrasia")
		.enterVerifyName("Euphrasia")
		.clickOnNameChange()
		.enterNewName("Marie")
		.enterFatherName("Charles")
		.enterVerifyFatherName("Charles")
		.enterMotherName("Margarette")
		.enterVerifyMotherName("Margarette")
		.enterDob("18/03/1995")
		.enterVerifyDob("18/03/1995")
		.selectEducationBoard("22")
		.selectVerifyEducationBoard("22")
		.enterRollNo("452785")
		.enterVerifyRollNo("452785")
		.selectYearOfPassing("2017")
		.selectVerifyYearOfPassing("2017")
		.clickOnGender()
		.clickOnVerifyGender()
		.selectLevelOfEduQualification("Post Graduation")
		.enterMobileNo("9952028078")
		.enterVerifyMobileNo("9952028078")
		.enterEmailId("euphrasia.charles@gmail.com")
		.enterVerifyEmailId("euphrasia.charles@gmail.com")
		.selectState("Tamil Nadu");
		
		
	}

}
