package Com.Driver;

import org.openqa.selenium.By;

import Com.Runner.BaseClass;

public class Action extends BaseClass {
	
	public static void ClickOnButton(By Elementname) {
		driver.findElement(Elementname).click();
	}
	public static void ClickonButton(By Elementname, String expectedResults) {
		driver.findElement(Elementname).click();
	}
	
	public static void EnterDetails(By Elementname, String keyword) {
		driver.findElement(Elementname).clear();
		driver.findElement(Elementname).sendKeys(keyword);
		}
	
	}
