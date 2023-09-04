package BAY_HomePageScenario;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import generic.utilities.BaseClass;
import object_Repo_BAY.AllCategories_Elements;
import object_Repo_BAY.HomePage_EleBAY;


public class AllCategoriesScenarioTest extends BaseClass{

	@Test(priority = 1)
	public void clickOnPanasonicStoreIconTest() throws InterruptedException {

		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		//click on all categories	
		hp.getAllCatagoiesIcon().click();
		Thread.sleep(2000);
		//click On panasonic store Icon
		AllCategories_Elements ac=new AllCategories_Elements(driver);
		wUtil.clickUsingJSE(driver, ac.getPanasonicStoreIcon());
	}

	@Test(priority = 2)
	public void clickOnBackToSchoolsIconTest() throws InterruptedException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		//click on all categories	
		hp.getAllCatagoiesIcon().click();
		Thread.sleep(2000);
		//click On top trending Icon
		AllCategories_Elements ac=new AllCategories_Elements(driver);
		ac.clickOnBackToSchoolIcon();
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
	
	@AfterTest
	public void afterTestConfig() {
		driver.quit();
	}
}
