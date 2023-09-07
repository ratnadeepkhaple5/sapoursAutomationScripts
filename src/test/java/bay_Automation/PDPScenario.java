package bay_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
import object_Repo_BAY.HomePage_EleBAY;

public class PDPScenario extends BaseClassBay{

	@DataProvider
	public String[] productList() {
		
	String[] data=new String[] {
	"(//a[@class='cx-product-name'])[2]"
	};
	return data;
	}
	@Test(dataProvider = "productList")
	public void getProductName(String data) {

	HomePage_EleBAY hp=new HomePage_EleBAY(driver);
	hp.sendTextOnSeachbar("iphone 12");
	hp.clickOnSearchButton();
	//select product
	 driver.findElement(By.xpath(data)).click();
	//get product name
	WebElement proName = driver.findElement(By.xpath("(//h2[@class='product-name'])[2]"));
	
	if (proName.isDisplayed()) {
		System.out.println(proName.getText());
	}
	}
	
	@Test(dataProvider = "productList")
	public void getSKUOfProduct(String data) {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		 driver.findElement(By.xpath(data)).click();
		String sku=driver.findElement(By.xpath("(//div[@class='lineText product-code']/child::span[@class='ng-star-inserted'])[2]")).getText();
		System.out.println(sku);
	}
	/**
	 * Click And collect button disable/enable check
	 * @param data
	 * #clickAndCollectButtonTest()
	 * @throws Exception 
	 */
	@Test(dataProvider = "productList")
	public void clickAndCollectButtonTest(String data) throws Exception {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		driver.findElement(By.xpath(data)).click();
		 
		 WebElement clickCollect = driver.findElement(By.xpath("//button[@class='btn collect-from-store-btn btn-block ng-star-inserted']"));
	
	//	 Assert.assertFalse(clickCollect.isEnabled());
		 
		 if (clickCollect.isEnabled()) {
			 Assert.assertTrue(true);
			 System.out.println("button enabled");
		} else {
			
			throw new Exception("button disabled");
		}
	}
	@Test(dataProvider = "productList")
	public void stockStatusCheck(String data) throws Exception {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		driver.findElement(By.xpath(data)).click();
		
		String stockStatus = driver.findElement(By.xpath("//span[@class='instock']")).getText();
		System.out.println(stockStatus);
		String inStock="In Stock";
		if (stockStatus.equals(inStock)) {
			driver.findElement(By.xpath("//*[text()=' Add to cart ']")).click();
			System.out.println("Product added to cart successfully");
		}else {
			throw new Exception("Product is out of stock");
		}
	}

	@Test(dataProvider = "productList")
	public void getBriefDescpription(String data) {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		driver.findElement(By.xpath(data)).click();
		
		String briefDescription = driver.findElement(By.xpath("//div[@class='description ng-star-inserted']")).getText();
		
		System.out.println(briefDescription);
	}
	
	@Test(dataProvider ="productList" )
	public void quantityIncreaseByOne(String data) {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		driver.findElement(By.xpath(data)).click();
		//quantity increase by one
		driver.findElement(By.xpath("//button[@aria-label='Add one more']")).click();
	}
	
	
	@Test(dataProvider ="productList" )
	public void quantityManualUpdate(String data) throws InterruptedException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 12");
		hp.clickOnSearchButton();
		//select product
		driver.findElement(By.xpath(data)).click();
		//quantity increase manually
		
		driver.findElement(By.xpath("//input[@aria-label='Quantity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Quantity']")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//input[@aria-label='Quantity']")).sendKeys("5");
	}
}
