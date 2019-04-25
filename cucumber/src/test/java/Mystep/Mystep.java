package Mystep;
import org.testng.annotations.BeforeMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
public class Mystep {
	
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeMethod
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "//Users//alim//driver//chromedriver");

		  WebDriver driver = new ChromeDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	

    @When("^input username$")
    public void input_username() throws Throwable {

    	 driver.get("https://www.google.com/search?q=pyunit&rlz=1C5CHFA_enUS831US831&oq=pyunit&aqs=chrome..69i59j69i57j0l4.4717j0j8&sourceid=chrome&ie=UTF-8");
    	 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web results'])[1]/following::h3[1]")).click();
    }

    @When("^password$")
    public void password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("input password");
    	//Assert.assertEquals(34, 40);
    	
    	
      
    }

    @When("^click the submit button$")
    public void click_the_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("click the button");
        //throw new PendingException();
    }

    @Then("^display result window$")
    public void display_result_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("display_result_window");
       
    }
}

