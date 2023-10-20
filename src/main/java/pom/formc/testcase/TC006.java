package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To signup new registration in form c";
		author="Euphrasia";
		category="Smoke";
		browser="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
	@Test
	public void formC() {
		new HomePage()
		
		.clickOnSignUpRegistration()
		.switchToNextWindow()
		.enterUserId("Euphy12345")
		.enterPassword("Euphrasia95")
		.enterConfirmPassword("Euphrasia95")
		.selectSecQuestion("3")
		.enterSecAnswer("Pride and Prejudice")
		.enterName("Euphrasia")
		.selectGender("F")
		.enterDob("18/03/1995")
		.enterDesignation("Manager")
		.enterEmailId("euphrasia.charles@gmail.com")
		.enterMobileNo("9952028078")
		.enterPhoneNo("26440656")
		.selectNationality("IND")
		.enterHotelName("Blue Lagoon")
		.enterCapacity("100")
		.enterHotelAddress("Anna Nagar")
		.selectHotelState("28")
		//.sendTabKey()
		.clickOnCity()
		.selectCity("4C")
		.selectFrroDescription("B002")
		.selectAccommodationType("GH")
		.selectAccommodationGrade("5s")
		.enterHotelEmailId("blue@gmail.com")
		.enterHotelMobileNo("9854637281")
		.enterHotelPhoneNo("26574839")
		.enterOwnerName("Ray")
		.enterOwnerAddress("Adyar")
		.selectOwnerState("28")
		//.sendTabKey()
		.clickOnOwnerCity()
		.selectOwnerCity("4C")
		.enterOwnerEmailId("ray@gmail.com")
		.enterOwnerPhoneNo("26758395")
		.enterOwnerMobileNo("8576473820")
		.clickOnAdd()
		.enterOwnerName("Monica")
		.enterOwnerAddress("Kilpauk")
		.selectOwnerState("24")
		.clickOnOwnerCity()
		.selectOwnerCity("2D")
		.enterOwnerEmailId("monica@gmail.com")
		.enterOwnerPhoneNo("26758395")
		.enterOwnerMobileNo("8576473820")
		.clickOnAdd()
		.enterOwnerName("Noah")
		.enterOwnerAddress("Hill tower")
		.selectOwnerState("9")
		.clickOnOwnerCity()
		.selectOwnerCity("15C")
		.enterOwnerEmailId("Noah@gmail.com")
		.enterOwnerPhoneNo("26758395")
		.enterOwnerMobileNo("8576473820")
		.clickOnAdd()
		.enterOwnerName("Lilly")
		.enterOwnerAddress("Adyar")
		.selectOwnerState("15")
		.clickOnOwnerCity()
		.selectOwnerCity("8D")
		.enterOwnerEmailId("lilly@gmail.com")
		.enterOwnerPhoneNo("26758395")
		.enterOwnerMobileNo("8576473820");
		//.closeAllTheBrowsers()*/
		
	}

}
