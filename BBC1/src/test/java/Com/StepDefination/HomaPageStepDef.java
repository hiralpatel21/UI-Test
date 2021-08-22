package Com.StepDefination;

import Com.Pages.HomePage;
import Com.Runner.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomaPageStepDef extends BaseClass {
	
	HomePage homepageObj=new HomePage();
	
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
		homepageObj.verifyHomePage();
	}

	@When("^I click on sport icon$")
	public void i_click_on_sport_icon() throws Throwable {
		homepageObj.verifySport();
	}

	@When("^I click on football icon$")
	public void i_click_on_football_icon() throws Throwable {
		homepageObj.verifyFootball();
	}

	@When("^I click on Scores & Fixtures Icon$")
	public void i_click_on_Scores_Fixtures_Icon() throws Throwable {
		homepageObj.verifyScores();
	}

	@Then("^I should see the record of all teams which are playing today$")
	public void i_should_see_the_record_of_all_teams_which_are_playing_today() throws Throwable {
	  
	}


}
