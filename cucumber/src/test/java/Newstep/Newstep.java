package Newstep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newstep {
	@Given("^enter usen name \"([^\"]*)\"$")
	public void enter_usen_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	   
	}

	@Given("^passwor \"([^\"]*)\"$")
	public void passwor(String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg2);
		
	}

	@When("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("sumbit button");
		
	}
	
	@Then("^goto the main page$")
	public void goto_the_main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("complete");
		
	   	}

}
