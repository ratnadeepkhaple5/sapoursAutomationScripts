package BAY_HomePageScenario;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.utilities.BaseClass;
import object_Repo_BAY.HomePage_EleBAY;

public class CategoryNavigationHomepage extends BaseClass{

	@Test(priority = 0/*invocationCount = 5*/)
	public void navigateToAllCatagories() throws InterruptedException {

		// move mouse pointer to all categories icon
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.mouseOverOnAllCategories();
	}
	@Test(priority = 2)
	public void clickOnDigitalCardsIcon() throws InterruptedException, AWTException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		WebElement source = driver.findElement(By.xpath("(//a[text()=' TV & Audio '])[1]"));
		WebElement dest = driver.findElement(By.xpath("(//a[text()=' Gaming '])[1]"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(source).perform();
		actions.moveByOffset(50, 0);
		 Robot rb=new Robot();
		 for(;;) {
		
			 if (hp.getDigitalCardsIcon().isDisplayed()) {
				 actions.release();
				hp.clickOnDigitalCards();
				break;
			} else {
				actions.moveByOffset(50, 0);
			}
		 }
		 rb.mouseMove(50, 0);
		actions.release();
		//wUtil.dragAndDrop(driver, source, dest);
	//	hp.clickOnDigitalCards();
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
