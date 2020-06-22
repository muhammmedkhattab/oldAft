package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	// protected

	public Select select;
	public Actions action;
	public static String currentWindowID = null;
	public static JavascriptExecutor jse;

	// create constructor
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Method to Click Buttons
	protected static void clickButton(WebElement button) {

		button.click();
	}

	// Method to send Keys
	protected static void setText(WebElement textElement, String value) {

		textElement.sendKeys(value);
	}

	// Method to Press Enter
	public void KeyPressEnter(WebElement webElement) {

		webElement.sendKeys(Keys.RETURN);
	}

	// Method to scroll down
	public void scrollToBottom() {

		jse.executeScript("scrollBy(0,1500)");
	}
	//Method to confirmCookies
	public void cookieHandle(WebDriver driver) {
		
		WebElement elementcookie = driver.findElement(By.xpath("//div[@class='cta-button bg-blue']"));
		jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", elementcookie);
		
	}
	//Method to handle windows
	public void WindowHandling(WebDriver driver) {
		currentWindowID = driver.getWindowHandle();

		for (String windowID : driver.getWindowHandles()) {

			driver.switchTo().window(windowID);
		/*	String URL = driver.getCurrentUrl();

			if (URL.contains(URL))

			{
			}*/

		}
		
		}

}
