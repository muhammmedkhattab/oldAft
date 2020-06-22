package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {

		super(driver);

		// scroll down
		jse = (JavascriptExecutor) driver;
	}

	// Subscribe Method
	public void subscribe(WebDriver driver, String subscribeLocator, String emailTxt, String subscribeBtn) {

		scrollToBottom();
		cookieHandle(driver);
		WebElement searchTextElement = driver.findElement(By.id((subscribeLocator)));
		searchTextElement.clear();
		clickButton(searchTextElement);
		setText(searchTextElement, emailTxt);

		WebElement subscribeBtnElement = driver.findElement(By.id((subscribeBtn)));
		clickButton(subscribeBtnElement);

	}

	// Change Language Method

	public void changeLanguage(WebDriver driver, String languageLocator) {
		
		cookieHandle(driver);
		WebElement languageElement = driver.findElement(By.xpath((languageLocator)));
		clickButton(languageElement);

	}

	// Navigate to Coya care Method
	
	public void navigateTo(WebDriver driver, String menuLocator) {
		
		cookieHandle(driver);
		WebElement menuElement = driver.findElement(By.xpath((menuLocator)));
		clickButton(menuElement);

	}

}
