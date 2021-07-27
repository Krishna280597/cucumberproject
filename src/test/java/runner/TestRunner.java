package runner;

import org.Base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinitions.ForReport;

@CucumberOptions(features = "src/test/resources", glue = "stepdefinitions",tags= {"@smoke"}, monochrome = true, plugin = { "pretty",
		"html:src\\test\\resources\\Reports", 
		"json:src\\test\\resources\\Reports\\jsonreport.json",
		"junit:src\\test\\resources\\Reports\\junitreport.xml" })
public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	@AfterTest
	public  static void JVMReportscreation() {

		ForReport.JVMReport("src\\test\\resources\\Reports\\jsonreport.json");
		System.out.println("done");
	}


	
}
