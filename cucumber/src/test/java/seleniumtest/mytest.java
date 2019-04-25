package seleniumtest;

import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
//import robotclass.Robottest;
import io.qameta.allure.Description;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import basic.Basic;

public class mytest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	
	

	driver = new ChromeDriver();
	driver.get("http://www.baidu.com");

	
	
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
 System.out.println("salam google");
 driver.manage().window().maximize();
   driver.get("http://www.amazon.com");
   driver.navigate().to("https://www.google.com");
   System.out.println("salam baidu");
   driver.get("http://wwww.yahoo.com");
   Basic bs=new Basic(driver);
  
   bs.screenshot("/Users/alim/eclipse-workspace/cucumber/src/test/java/features/yahoo.png");
   
   driver.navigate().to("https://www.baidu.com");
  }
 // @Test
  @Description("first run ")
  public void run() throws IOException {
	  
	  ProcessBuilder processBuilder = new ProcessBuilder();
	  
	 
		
  processBuilder.command("bash", "/Users/alim/allure/bin/allure  serve /Users/alim/eclipse-workspace/cucumber/allure-results ");
  processBuilder.start();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	  
	  String cmd = "/Users/alim/allure/bin/allure  serve  /Users/alim/eclipse-workspace/cucumber/allure-results";
	  Runtime run = Runtime.getRuntime();
	  Process pr = run.exec(cmd);
	 
	 
      driver.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
