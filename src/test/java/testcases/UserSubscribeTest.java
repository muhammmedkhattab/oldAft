package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.DataDriven;
import pages.HomePage;
import pages.PageBase;

public class UserSubscribeTest extends TestBase {
	HomePage homeObject;
	PageBase pageObject;
	// Calling Testdata 
	String homePageURL = DataDriven.getCellData("GeneralTestData", "HomePageProdURL", 1);
	String SubURL = DataDriven.getCellData("GeneralTestData", "SubURL", 1);
	String emailTXT = DataDriven.getCellData("GeneralTestData", "EmailText", 1);
	String subsTXTLocator = DataDriven.getCellData("HomePageLocators", "SubsTxtLocator", 1);
	String subsBtnLocator = DataDriven.getCellData("HomePageLocators", "SubsButtonLocator", 1);

	@Test(priority = 3)
	public void userSubscribeTC() {

		homeObject = new HomePage(driver);
		pageObject = new HomePage(driver);
		homeObject.subscribe(driver, subsTXTLocator, emailTXT, subsBtnLocator);
		pageObject.WindowHandling(driver);

		// Assert on the URL
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains(SubURL));

	}

}
