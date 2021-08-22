package Com.StepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import Com.Constants.HomePageConst;
import Com.Driver.Action;
import Com.Runner.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;


	public class Hooks extends BaseClass {
	@Before
		public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.co.uk/");
		Thread.sleep(5000);
		//Action.ClickOnButton(HomePageConstants.SHOPNOW);
		Thread.sleep(2000);

		Action.ClickOnButton(HomePageConst.COOKIES);
		Thread.sleep(3000);
	}

	@After
	public void close() {
		driver.close();
	}

	}

