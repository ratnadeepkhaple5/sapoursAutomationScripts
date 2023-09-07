package bay_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
import generic.utilities.WebdriverUtility;
import object_Repo_BAY.HomePage_EleBAY;

public class SortDropdownScenario extends BaseClassBay {

	@Test(dataProvider = "dropdownOptions" )
	public void sortProductsTest(String data) throws InterruptedException {
		System.out.println("sort product started");
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar("iphone 13");
		WebElement ele = driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']"));
		ele.click();
		driver.findElement(By.xpath(data)).click();
	}

	@DataProvider(name = "dropdownOptions")
	public  String[][] dropdownOptions() {

		String[][] data=new String[][] {
		//	{"//span[text()='Relevance']"},
			{"//span[text()='Top Rated']"},
			{"//span[text()='Name (Ascending)']"},
			{"//span[text()='Name (Descending)']"},
			{"//span[.='Price (Lowest First)']"},
			{"//span[text()='Price (Highest First)']"},
			{"//span[text()='Promotions Available']"},
			{"//span[text()='Best Seller']"}
		};
		return data;
	}

	@AfterTest
	public void afertest(){
		driver.close();
	}
}
