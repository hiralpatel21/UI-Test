package Com.StepDefination;

import Com.Pages.Articles;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArticleStepDef {

	Articles ArticleObj=new Articles();
	
	@When("^I click on \"([^\"]*)\" keyword$")
	public void i_click_on_keyword(String expectedResults) throws Throwable {
		ArticleObj.verifyArticle(expectedResults);
	}

	@Then("^I should see the article about that sport$")
	public void i_should_see_the_article_about_that_sport() throws Throwable {
	    
	}

}
