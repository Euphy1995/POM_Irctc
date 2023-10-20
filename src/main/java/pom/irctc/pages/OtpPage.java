package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers{
	
	public static String error = null;
	
	public OtpPage verifyOtpErrorMsg(String data) {
		verifyTextByXpath(prop.getProperty("OtpPage.VerifyOtpError.Xpath"),""+error);
		return this;
		}
	public OtpPage getErrorText() {
		error = getTextByXpath(prop.getProperty("OtpPage.GetOtpError.Xpath"));
		return this;
	}
	public OtpPage closeAllTheBrowsers() {
		closeAllBrowsers();
		return null;
	}
}
