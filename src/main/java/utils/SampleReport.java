package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	
	@Test
	public void reportGeneration() {
		
		
		ExtentReports reports = new ExtentReports("./Results/reports.html", false);
		
		
		
		ExtentTest test = reports.startTest("TC005", "To verify IRCTC registration for the new user sign up");
		test.assignAuthor("Euphrasia");
		test.assignCategory("Regression");
		
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		test.log(LogStatus.PASS, "The apllication got launched with the url successfully");
		
		reports.endTest(test);
		reports.flush();
		
		
		
		
	}

}
