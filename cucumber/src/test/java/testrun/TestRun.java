package testrun;


import java.io.File;


import org.junit.runner.RunWith;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/java/features",
		glue= {"Newstep"},
		format = {"pretty", "html:target/Destination/myreport.html"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		
		
		)


public class TestRun extends AbstractTestNGCucumberTests {
	@AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("./src/test/java/features/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
	@BeforeClass
	public static void setup() {
	ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	extentProperties.setReportPath("output/myreport.html");
	}
	    
	
}
