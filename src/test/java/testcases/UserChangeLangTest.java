package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.DataDriven;
import pages.HomePage;

public class UserChangeLangTest extends TestBase {
	HomePage homeObject;

	// Calling Testdata
	String homePageURL = DataDriven.getCellData("GeneralTestData", "HomePageProdURL", 1);
	String changeLanENLocator = DataDriven.getCellData("HomePageLocators", "ChangeLangToENLocator", 1);
	String EnglishURL = DataDriven.getCellData("GeneralTestData", "EnglishURL", 1);
	
	
	@Test(priority = 1)
	public void userChangeLanguageTC() {
		
		homeObject = new HomePage(driver);
		homeObject.changeLanguage(driver, changeLanENLocator);
		
		// Assert on the URL
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains(EnglishURL));
	}

}
