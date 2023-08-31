package altannaf_objectReposiratory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Al {

	WebDriver driver;
	
	//Identification
	@FindBy(xpath = "//*[@class='cat_icon']")
	private WebElement aboutAltannaf;
	
	@FindBy(xpath = "(//*[text()='Our Products'])[1]")
	private WebElement ourProducts;

	
	//utilization- gettors
	
	public WebElement getAboutAltannaf() {
		return aboutAltannaf;
	}

	public WebElement getOurProducts() {
		return ourProducts;
	}
	//Intialisation
	public Homepage_Al(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//business logic
	
	public void clickOnAboutAltannaf() {
		aboutAltannaf.click();
	}
	public void mouseOverOnOurProducts() {
//		Actions actions=new Actions(driver);
//		actions.moveToElement(ourProducts).click().perform();
	}
}
