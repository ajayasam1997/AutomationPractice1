package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='reg_password' and @name='password']")
	@CacheLookup
	private WebElement pass;
	@FindBy(xpath = "//input[@name='email']")
	@CacheLookup
	private WebElement email;
	@FindBy(xpath = "//input[@name='register']")
	@CacheLookup
	private WebElement register;

	// Action Methods

	public String enterPassword(String password) {

		pass.sendKeys(password);

		return password;
	}

	public String enterEmail(String emailAddress) {

		email.sendKeys(emailAddress);
		return emailAddress;
		
	}

	public void clickOnRegister() {
		register.click();
	}

}
