package bay_Automation;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
import object_Repo_BAY.HomePage_EleBAY;

public class SearchProduct extends BaseClassBay{

	
	@Test(dataProvider = "searchData")
	public void searchProductAndCheckAvailability(String data) throws InterruptedException {

		
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.sendTextOnSeachbar(data);
		hp.clickOnSearchButton();
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());
		
		String result = driver.findElement(By.cssSelector("[class='total_result']")).getText();
	//	System.out.println(result);
		String ch="";
		for(int i=0;i< result.length();i++) {
			
			char[] chara = result.toCharArray();
			
			if (Character.isDigit(chara[i])) {
				ch=ch+chara[i];   
			}	
		}
	//	System.out.println(ch);
		int totalProducts=Integer.parseInt(ch);
			System.out.println(totalProducts);
		Assert.assertTrue(true);
	}	
	@DataProvider
	public String[] searchData() {
		String[] data=new String[] {
			"iphone","12345","iphone 12","4564jjkg"
		};
		return data;
	}
	
	@AfterTest
	public void afterTest() {
		//driver.close();
	}
}
