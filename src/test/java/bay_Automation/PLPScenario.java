package bay_Automation;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
import object_Repo_BAY.HomePage_EleBAY;

public class PLPScenario extends BaseClassBay {
	@Test
	public void plpGetAllProdName() throws AWTException {

		Robot robot=new Robot();		
		robot.mouseWheel(10);

		//	String sourceEle="HP Victus Gaming Laptop Intel� Core� i5-12450H, NVIDIA� GeForce RTX� 3050 4GB, 16GB RAM, 512GB SSD, Windows 11 Home, 15.6 Inch FHD, Performance Blue with Bundle";

		List<WebElement> actualEles = driver.findElements(By.xpath("(//*[@class='cx-product-name'])"));

		for(WebElement webele:actualEles) {

			System.out.println(webele.getText().toString());
			//Assert.assertEquals(sourceEle, actualEle, "data matched");
		}
	}
	////a[@class='product-details-cnt']/child::div[@class='price']

	@Test
	public void plpGridiew() {

		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone");
		hp.clickOnSearchButton();

		driver.findElement(By.cssSelector("[class='cx-icon fas fa-th-large ng-star-inserted']")).click();
		Assert.assertTrue(true);
	}
	@Test
	public void plpListiew() {

		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone");
		hp.clickOnSearchButton();

		driver.findElement(By.cssSelector("[class='cx-icon fas fa-bars ng-star-inserted']")).click();
		
		Assert.assertTrue(true);
	}
	@AfterTest
	public void endConfig() {
		//	driver.quit();
	}
}
