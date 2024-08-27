package StepDefinition;

import Test.LoginTest;
import io.cucumber.java.en.*;

public class LoginStepDefinition {
	
	
	LoginTest loginTest = new LoginTest();
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginTest.setup();
	   
	}

	@When("user enters valid {string} and invalid {string}")
	public void user_enters_valid_and_invalid(String string, String string2) throws Exception {
		loginTest.loginTestWithInvalidCredential();
	  
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	  
	}

	@Then("user receives Invalid credentials message")
	public void user_receives_invalid_credentials_message() {
	   
	}

	@When("user enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String string, String string2) throws Exception {
		loginTest.loginTestWithValidCredential();
	}

	@Then("user is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	   
	}
}
