package bay_Automation;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
@Listeners(generic.utilities.ListenerImplementationWithExtentReport.class)
public class BrowserCategoryHomepageGetText extends BaseClassBay {
/*
	@FindBy(xpath = "//a[@class='nav-menu ng-star-inserted' and @href]")
	private WebElement allCategories;

	public WebElement getAllCategories() {
		return allCategories;
	}
*/
	@Test
	public void browseCategory()  {
		
		 List<WebElement> categories = driver.findElements(By.xpath("//a[@class='nav-menu ng-star-inserted' and @href]"));
		 
		 try {
		for(WebElement cat:categories) {
			
			System.out.println(cat.getText());
		}
		 }catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
	}
}
