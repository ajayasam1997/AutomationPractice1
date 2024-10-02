package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoggedInPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_02_DDT extends BaseClass {

	@Test(dataProvider = "RegistrationData", dataProviderClass = DataProviders.class, groups = { "regression", "master",
			"sanity" })

	public void registration(String emailAddress, String password) {

		try {

			logger.info("TC_01_Register_DataDrivenTesting Started");

			// Creating HomePage object
			HomePage homePage = new HomePage(driver);
			MyAccountPage myAccountPage = new MyAccountPage(driver);
			LoggedInPage loggedInPage = new LoggedInPage(driver);

			homePage.clickOnMyAccount();
			logger.info("Clicked on MyAccount from HomePage");

			// String filePath =
			// "C:\\Users\\Admin\\Desktop\\MyProjects\\AutomationPractice1\\testData\\RegTestData.xlsx";

			// ExcelUtility excelUtility = new ExcelUtility(filePath);

			// int totalRows = excelUtility.getRowCount("Sheet1");

			// logger.info("total Rows are " + totalRows);

			// for (int r = 1; r <=1; r++) {

			// emailAddress = excelUtility.getCellData("Sheet1", r, 0);

			// System.out.println(emailAddress);
			// password = excelUtility.getCellData("Sheet1", r, 1);
			// System.out.println(password);
			myAccountPage.enterEmail(emailAddress);

			logger.info("Logged In with " + emailAddress);
			myAccountPage.enterPassword(password);
			logger.info("Password entered for " + emailAddress);

			myAccountPage.clickOnRegister();
			logger.info("Clicked on registered button");

			loggedInPage.logOut();
			logger.info("Logged out Successfully");

			// myAccountPage.enterEmail(emailAddress);
			// myAccountPage.enterPassword(password);

		} catch (

		Exception e) {

			logger.debug("TC_01_Register_DataDrivenTesting failed");
			Assert.fail();

		}
	}

}
