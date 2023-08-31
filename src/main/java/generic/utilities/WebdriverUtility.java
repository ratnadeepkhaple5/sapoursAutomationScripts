package generic.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all the generic methods related to 'WebDriver' actions
 * 
 * @author Ratnadeep_Khaple
 */
public class WebdriverUtility {

	//Window Operations
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {

		driver.manage().window().maximize();
	}

	//Waits	
	/**
	 * This method will wait until entire Dom(page source) to load
	 * @param driver
	 */
	public void waitForDom(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * This method will until element to be visible
	 * @param driver
	 * @param element
	 */
	public void waitUntilElementToVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method will until element to be clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method represent the 'Custom Wait' where it will for the particular element
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitAndClickOnElement(WebElement element) throws InterruptedException {
		int count=5;
		while (count > 0) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(3000);
				count++;
			}
		}
	}
	//DropDowns-Select class
	/**
	 * this method will handle dropdown by using select class based on Index
	 * @param element
	 * @param index
	 */	
	public void handleDropdown(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * this method will handle dropdown by using select class based on visibleText
	 * @param element
	 * @param visibleText
	 */
	public void handleDropdown(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * this method will handle dropdown by using select class based on value
	 * @param value
	 * @param element
	 */
	public void handleDropdown(String value,WebElement element) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	//Actions Class method
	/**
	 * this method will perform mouse hover actions on particular element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverOn(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	/**
	 * this method will perform double click on Webpage
	 * @param driver
	 */		
	public void doubleClick(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.doubleClick().perform();;
	}
	/**
	 * this method will perform double click on particular webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	/**
	 * this method will right click on WebPage
	 * @param driver
	 */
	public void rightClickOnPage(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.contextClick().perform();
	}
	/**
	 * this method will right click on WebElement
	 * @param driver
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
	}
	/**
	 * this method will perform drag and drop operations on element from source
	 * element location to target(dest) element location
	 * @param driver
	 * @param Srcelement
	 * @param destElement
	 */
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement dest) {
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, dest).perform();	
	}
	//Robot Class
	/**
	 * this method will press 'Enter'Key & release EnterKey using Robot Class
	 * @throws AWTException
	 */		
	public void pressEnterUsingRobot() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//Handle Alerts
	/**
	 * This method will Accept alert popup
	 * @param driver
	 */		
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * This method will Dismiss alert popup
	 * @param driver
	 */	
	public void dissmissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this will get the text of alert popUp
	 * @param driver
	 * @return
	 */
	public String getTextOfAlert(WebDriver driver) {
		String alertText = driver.switchTo().alert().getText();
		return alertText;

	}
	//TakesSceenshot
	/**
	 * this will take "Page" ScreenShot and save in screenshot folder
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */		
	public String takeScreenShot(WebDriver driver,String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String path = "./BAYScreenShots/"+screenshotName+".png";
		File destFile=new File(path);
		FileHandler.copy(tempFile, destFile);
		return destFile.getAbsolutePath();
	}
	/**
	 * this will take 'Element' ScreenShot and save in screenshot folder
	 * @param element
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */		
	public String takeScreenShot(WebElement element,String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)element;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String path = "./BAYScreenShots/"+screenshotName+".png";
		File destFile=new File(path);
		FileHandler.copy(tempFile, destFile);
		return destFile.getAbsolutePath();
	}

	//window scrolling by using javaScriptExecutor	
	/**
	 * this method will scroll window until 500 y units vertically
	 * @param driver
	 */
	public void scrollWindow(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)","");
	}
	/**
	 * this method will scroll until the element to load 
	 * @param driver
	 * @param element
	 */
	public void scrollWindow(WebDriver driver, WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);

		//or

		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")", element);
	}
	/**
	 * this method will click on element using jse
	 * @param driver
	 * @param element
	 */
	public void clickUsingJSE(WebDriver driver, WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element);
	}
	/**
	 * this method will send data on disabled element/ or send text using JSE
	 * @param driver
	 * @param element
	 */
	public void sendTextUsingJSE(WebDriver driver,String textvalue,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+textvalue+"'", element);
	}
}
