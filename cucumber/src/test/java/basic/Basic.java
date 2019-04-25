package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;

public class Basic {
	WebDriver driver = null;
	String proppath;
	
			
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

	public Basic(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public String getProppath() {
		return proppath;
	}
	public void setProppath(String proppath) {
		this.proppath = proppath;
	}


	
	public Properties prop;
	
	
	public void embedScreenshot(Scenario scenario) {
		  try {
		    if (!scenario.isFailed()) {
		      // Take a screenshot only in the failure case
		      return;
		    }

		    String webDriverType = System.getProperty("WebDriverType");
		    if (!webDriverType.equals("HtmlUnit")) {
		      // HtmlUnit does not support screenshots
		      byte[] screenshot = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png");
		    }
		  } catch (WebDriverException somePlatformsDontSupportScreenshots) {
		    scenario.write(somePlatformsDontSupportScreenshots.getMessage());
		  }
		}
	public void init() {
		
		
	    }
	
	  public void  screenshot(String pt) throws IOException {
		
		File src= ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
		
		 // now copy the  screenshot to desired location using copyFile //method
		   FileUtils.copyFile(src, new File(pt));
		   
		 
	
	   }
	  
	  
	  public void run(String cmd) throws IOException {
		  Runtime run = Runtime.getRuntime();
		  Process pr = run.exec(cmd);
		  
	  }
	  
	  public String getparam(String name) throws IOException {
		  prop= new Properties();
		  FileInputStream fis=new FileInputStream(this.proppath);

		  prop.load(fis);
		  String myname=prop.getProperty(name);
		  
		  
		  return myname;
	  }
	  
	  
	  
}
