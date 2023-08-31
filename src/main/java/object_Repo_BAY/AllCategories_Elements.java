package object_Repo_BAY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCategories_Elements {

	WebDriver driver;
	
//Identification	
	@FindBy(xpath = "//a[text()=' Most Popular ']")
	private WebElement mostPopularIcon;
	
	@FindBy(xpath = "//a[text()=' Top Trending ']")
	private WebElement topTrendingIcon;
	
	@FindBy(xpath = "//a[text()=' Office Automation ']")
	private WebElement officeAutomationIcon;
	
	@FindBy(xpath = "//a[text()=' Swimming  Fitness ']")
	private WebElement swimmingfitnessIcon;
	
//Initialization	
	public AllCategories_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//Utilization - getters
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMostPopularIcon() {
		return mostPopularIcon;
	}
	public WebElement getTopTrendingIcon() {
		return topTrendingIcon;
	}
	public WebElement getOfficeAutomationIcon() {
		return officeAutomationIcon;
	}
	public WebElement getSwimmingfitnessIcon() {
		return swimmingfitnessIcon;
	}
	
//Actions Method-Business Logic
	
	public void clickOnMostPopularIcon() {
		mostPopularIcon.click();
	}
	public void clickOnTopTrendingIcon() {
		topTrendingIcon.click();
	}
	public void clickOnOfficeAutoamtionIcon() {
		officeAutomationIcon.click();
	}
	public void clickOnSwimmingFitness() {
		swimmingfitnessIcon.click();
	}
	
}
