package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class MouseEvents extends BaseClass {

	
//	public void clickOnDemoSite() {
//
//		HomePage hp = new HomePage(driver);
//		hp.clickOnDemoSite();
//
//	}

	@Test
	public void doubleClickOnTestCases() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.doubleClickOnTestCases();

	}

}
