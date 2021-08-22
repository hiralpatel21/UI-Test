package Com.StepDefination;

import Com.Pages.SignIn;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef {
	SignIn signinObj=new SignIn();
	@When("^I click on signin icon$")
	public void i_click_on_signin_icon() throws Throwable {
		signinObj.verifySignin();
	}

	@When("^I enters invalid credentials for login$")
	public void i_enters_invalid_credentials_for_login(DataTable login) throws Throwable {
		
		signinObj.LoginEmail(login);
		
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		signinObj.verifySigninButton();
		
	}

	@Then("^I should see the error message$")
	public void i_should_see_the_error_message() throws Throwable {
	   
	}
}
