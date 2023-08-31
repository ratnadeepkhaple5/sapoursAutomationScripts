package BAY_HomePageScenario;

import org.testng.annotations.Test;

import generic.utilities.BaseClass;
import object_Repo_BAY.HomePage_EleBAY;

public class NavigationBarScenariosTest extends BaseClass{

	@Test(priority = 0/*invocationCount = 5*/)
	public void navigateToAllCatagories() throws InterruptedException {

		// move mouse pointer to all categories icon
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.mouseOverOnAllCategories();
	}
	@Test(priority = 1)
	public void clickOnGiftIcon() {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.clickOnGiftCards();
	}

	@Test(priority = 2)
	public void clickOnDigitalCardsIcon() {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.clickOnDigitalCards();;
	}
	@Test(priority = 3)
	public void clickOnAirConditioners() {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		wUtil.clickUsingJSE(driver, hp.getAirConditionerIcon());
	}
	@Test(priority = 4)
	public void NavigateToMyCart() {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.clickOnMyCartIcon();
	}
}
