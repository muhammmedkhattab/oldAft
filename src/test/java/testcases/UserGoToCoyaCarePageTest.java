package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.DataDriven;
import pages.HomePage;

public class UserGoToCoyaCarePageTest extends TestBase{
	HomePage homeObject;
	
	// Calling Testdata 
		String homePageURL = DataDriven.getCellData("GeneralTestData", "HomePageProdURL", 1);
		String menuLocator = DataDriven.getCellData("HomePageLocators", "CoyaCareMenuBtnLocator", 1);
		String CarePageTitle = DataDriven.getCellData("GeneralTestData", "CarePageTitle", 1);
		
		
		@Test(priority = 2)
		public void userNavigateToCoyaCare() {

			homeObject = new HomePage(driver);
			homeObject.navigateTo(driver, menuLocator);
			// Assert on the Page Tile
			String Title = driver.getTitle();
			//System.out.println(Title);
			Assert.assertTrue(Title.equalsIgnoreCase(CarePageTitle));

		}

}
