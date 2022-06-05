package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	GoogleHomePage instance = new GoogleHomePage();
	
	@When("I enter text in search field")
	public void i_enter_text_in_search_field() {
	    instance.Search();
	}

	@When("I click Google Search button")
	public void i_click_google_search_button() {
	    instance.ClickGoogleSearch();
	}

	@Then("The results are published")
	public void the_results_are_published() {
	   //Do nothing
	}

	@Given("The browser is up and google home page is launched")
	public void the_browser_is_up_and_google_home_page_is_launched() {
	    instance.LaunchGoogleChrome();
	}

	@When("I type {string} in Search field")
	public void i_type_in_search_field(String string) {
		instance.Search(string);
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
	   instance.CloseBrowser();
	}
}
