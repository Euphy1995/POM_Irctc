package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class HotelPaymentPage extends GenericWrappers{
	
	public static String gstError = null;
	
	public HotelPaymentPage clickOnCheckBox() {
		clickByXpath(prop.getProperty("HotelPaymentPage.ClickOnCheckBox.Xpath"));
		return this;
	}
	public HotelPaymentPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("HotelPaymentPage.ClickOnMakePayment.Xpath"));
		return new HotelPaymentPage();
	}
	public OtpPage clickOnVerifyOtp() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='Verify']")));
	clickByXpath(prop.getProperty("HotelPaymentPage.ClickOnVerifyOtp.Xpath"));
	return new OtpPage();
	}
	public HotelPaymentPage mouseHoverOnVerify() {
		mouseHoverByXpath(prop.getProperty("HotelPaymentPage.MouseHoverOnVerify.Xpath"));
		return this;
		}
	public HotelPaymentPage getGstErrorMsg() {
		gstError = getTextByXpath(prop.getProperty("HotelPaymentPage.GetErrorMsg.Xpath"));
		return this;
	}
	public HotelPaymentPage verifyGstErrorMsg(String data) {
		verifyTextByXpath(prop.getProperty("HotelPaymentPage.VerifyGstError.Xpath"), ""+gstError);
		return this;
	}
	public HotelPaymentPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return null;
	}
}
