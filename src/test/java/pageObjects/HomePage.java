package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='https://practice.automationtesting.in/my-account/']")
	@CacheLookup
	private WebElement myAccount;

	@FindBy(xpath = "//a[@href='http://demo.automationtesting.in/Register.html']")
	@CacheLookup
	private WebElement demoSite;

	@FindBy(xpath = "//a[@href='https://practice.automationtesting.in/test-cases/']")
	@CacheLookup
	private WebElement testCases;

	// Action Methods

	public void clickOnMyAccount() {

		myAccount.click();
	}

	public void clickOnDemoSite() {

		Actions act = new Actions(driver);

		Action action = act.moveToElement(demoSite).click().build();// Action is created

		action.perform();// Action is performed

	}

	public void doubleClickOnTestCases() throws InterruptedException {

		Actions act = new Actions(driver);

		Action action = act.doubleClick(testCases).build();// Action is created 
		
		
		
		action.perform();// Action is performed

		

	}

}
