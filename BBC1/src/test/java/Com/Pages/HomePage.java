package Com.Pages;

import org.junit.Assert;

import Com.Constants.HomePageConst;
import Com.Driver.Action;
import Com.Runner.BaseClass;

public class HomePage extends BaseClass {
	public void verifyHomePage() {
		Assert.assertEquals("BBC - Home", driver.getTitle());
		Assert.assertEquals("https://www.bbc.co.uk/", driver.getCurrentUrl());
	}
	
	public void verifySport() throws InterruptedException {
		Action.ClickOnButton(HomePageConst.SPORT);
		Thread.sleep(2000);
	}
	public void verifyFootball() throws InterruptedException {
		Action.ClickOnButton(HomePageConst.FOOTBALL);
		Thread.sleep(2000);
	}
	public void verifyScores() throws InterruptedException {
		Action.ClickOnButton(HomePageConst.SCORES);
		Thread.sleep(2000);
	}
}
