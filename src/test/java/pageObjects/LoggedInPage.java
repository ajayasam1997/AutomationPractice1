package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoggedInPage extends BasePage {

	public LoggedInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")
	@CacheLookup
	private WebElement logout;

//Action Method

	public void logOut() {

		logout.click();
	}
}