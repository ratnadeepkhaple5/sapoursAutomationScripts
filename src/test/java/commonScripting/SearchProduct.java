package commonScripting;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LULU_objectReposiratory.HomePage_lulu;
import generic.utilities.JavaUtility;
import generic.utilities.PropertyFileUtility;
import generic.utilities.WebdriverUtility;
import object_Repo_BAY.HomePage_EleBAY;

public class SearchProduct {
	ChromeDriver driver;

	@BeforeMethod
	public void beforeConfig() throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		PropertyFileUtility putil=new PropertyFileUtility();
		driver.get(putil.readDataFromPropertyFile("bay"));
	}
	// view / navigate to page	
	@Test(priority = 1)
	public void catogaryBrowseView() throws InterruptedException {
		System.out.println("view product started");
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.getDigitalCardsIcon().click();
	//	driver.navigate().back();
		Thread.sleep(3000);
		hp.getGasCookersIcon().click();
		/*/
		HomePage_lulu hl=new HomePage_lulu(driver);
		hl.getLuluLogoImage().click();
		hl.getFreshFoodIcon().click();
		*/
	}
	//sort products
	@Test(priority = 2)
	public void sortProductsTest() throws InterruptedException {
		System.out.println("sort product started");
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("Apple iPhone  XR , 64GB, 4G LTE - Black");
		WebElement ele = driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']"));
		ele.click();
		WebdriverUtility wutil=new WebdriverUtility();
		//	driver.findElement(By.xpath("//span[.='Best Seller']")).click();
		driver.findElement(By.xpath("//span[.='Price (Lowest First)']")).click();
	}
	//search and add to cart	
	@Test(priority = 3)
	public void searchProductAndCheckAvailability() throws InterruptedException {

		System.out.println("search scenario started");
		
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone");
		hp.clickOnSearchButton();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		/*/
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				HomePage_lulu hp=new HomePage_lulu(driver);
				hp.searchTextOnLulu("iphone");
				hp.clickSearchSubmitButton();
				WebElement resultCount=null;
				try {
					resultCount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='mb-0'])[2]")));
					if (resultCount.isDisplayed()) {
						System.out.println(resultCount.getText());	
					}
				} catch (Exception e) {
					WebElement noData = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mt-4']")));
					String noDataString = noData.getText();
					System.out.println(noDataString);
				}
				
			//*/ 
	}
	//add to cart	
	@Test(priority = 4)
	public void addToCart() {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		System.out.println("Add to cart scenario");
		hp.sendTextOnSeachbar("Apple IPhone 12 ");
		hp.getSearchButton().click();
		driver.findElement(By.xpath("(//*[@class='cx-product-name'])[1]")).click();
		driver.findElement(By.xpath("//*[text()=' Add to cart ']")).click();
		driver.findElement(By.xpath("//*[text()='view cart']")).click();
		driver.findElement(By.xpath("//*[text()=' Proceed To Checkout ']")).click();
		/*/
		HomePage_lulu hl=new HomePage_lulu(driver);
		hl.searchTextOnLulu("apple iphone 13");
		hl.clickSearchSubmitButton();
		driver.findElement(By.xpath("(//*[contains(text(),'Apple iPhone 13 128GB Starlight')])[2]")).click();
		driver.findElement(By.id("addToCartButton")).click();
		driver.findElement(By.xpath("//a[@href='/en-in/cart']")).click();
		// */
	}
	//check apply voucher scenario
	@Test(priority = 5)
	public void applyVouchersTest() throws IOException, InterruptedException {
		System.out.println("check apply voucher scenario");
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.sendTextOnSeachbar("apple iphone 13");
		hp.getSearchButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='cx-product-name'])[1]")));

		driver.findElement(By.xpath("(//*[@class='cx-product-name'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Add to cart ']")).click();
		driver.findElement(By.xpath("//*[text()='view cart']")).click();

		PropertyFileUtility putil=new PropertyFileUtility();
		String voucher=putil.readDataFromPropertyFile("voucher");
		driver.findElement(By.xpath("//*[@placeholder='Promo code ']")).sendKeys(voucher);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Apply ']")).click();
		JavaUtility jutil=new JavaUtility();
		WebdriverUtility wUtil=new WebdriverUtility();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver, "toCheckScreenShotAppiled"+jutil.getRandomNumber());

	}
	@AfterMethod
	public void afterConfig() {
		//	driver.quit();
	}
}
