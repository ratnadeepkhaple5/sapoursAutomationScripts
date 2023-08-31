package altannaf_objectReposiratory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains objects/elements on altannaf-Langauge selector page
 * 
 * @author Ratnadeep
 *
 */
public class LanguageSelectorPage_al {

	WebDriver driver;
	
	//Identification
	@FindBy(xpath = "//*[contains(text(),'English')]")
	private WebElement EnglishButton;

	@FindBy(xpath = "//*[contains(text(),'العربية')]")
	private WebElement ArabicButton;

	//Utilization-getters

	public WebElement getEnglishButton() {
		return EnglishButton;
	}

	public WebElement getArabicButton() {
		return ArabicButton;
	}
	
	//Intialization
	
	public LanguageSelectorPage_al(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Business logic
	
	public void clickOnEnglishButton() {
		EnglishButton.click();
	}
	public void clickOnArabicButton() {
		ArabicButton.click();
	}





}
