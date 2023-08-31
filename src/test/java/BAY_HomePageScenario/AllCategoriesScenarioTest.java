package BAY_HomePageScenario;

import org.testng.annotations.Test;

import generic.utilities.BaseClass;
import object_Repo_BAY.AllCategories_Elements;
import object_Repo_BAY.HomePage_EleBAY;


public class AllCategoriesScenarioTest extends BaseClass{

	@Test(priority = 1)
	public void clickOnMostPopularIconTest() throws InterruptedException {

		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		//click on all categories	
		hp.getAllCatagoiesIcon().click();
		Thread.sleep(2000);
		//click On most popular Icon
		AllCategories_Elements ac=new AllCategories_Elements(driver);
		wUtil.clickUsingJSE(driver, ac.getMostPopularIcon());
	}

	@Test(priority = 2)
	public void clickOnTopTrendingIconTest() throws InterruptedException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		//click on all categories	
		hp.getAllCatagoiesIcon().click();
		Thread.sleep(2000);
		//click On top trending Icon
		AllCategories_Elements ac=new AllCategories_Elements(driver);
		ac.clickOnTopTrendingIcon();
	}
	
	@Test(priority = 3)
	public void clickOnOfficeAutomationIconTest() throws InterruptedException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		//click on all categories	
		hp.getAllCatagoiesIcon().click();
		Thread.sleep(2000);
		//click On Office Automation Icon
		AllCategories_Elements ac=new AllCategories_Elements(driver);
		ac.clickOnOfficeAutoamtionIcon();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
}
