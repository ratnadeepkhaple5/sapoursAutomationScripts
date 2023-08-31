package object_Repo_BAY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.utilities.WebdriverUtility;
/**
 * this class contains Homepage elements 
 * @author Ratnadeep_Khaple
 *
 */
public class HomePage_EleBAY{
	WebDriver driver;
	/**
	 * HEADER elements	
	 * 
	 * @bAYLogoIcon @ChangeLangToArebic @loginIcon @allCatagoiesIcon
	 * @seachBarTextArea
	 */

	//declaration
	@FindBy(xpath = "//img[@alt='Best Al Yousufi']")
	private WebElement bAYLogoIcon;

	@FindBy(xpath = "//a[@class='blue-bg-link mt-30 current-lang']")
	private WebElement ChangeLangToArebic;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginIcon;

	@FindBy(xpath = "//input[@placeholder='Search here...']")
	private WebElement searchBarTextArea;
	
	@FindBy(xpath = "//*[@class='search-icon']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	//Utilization - getters
	public WebElement getbAYLogoIcon() {
		return bAYLogoIcon;
	}
	public WebElement getChangeLangToArebic() {
		return ChangeLangToArebic;
	}
	public WebElement getLoginIcon() {
		return loginIcon;
	}
	public WebElement getSearchBarTextArea() {
		return searchBarTextArea;
	}
	/**
	 * Navigation Bar Elements
	 * @giftCardsIcon @digitalCardsIcon @airConditionerIcon
	 * @mobilePhonesIcon @refrigaratorsIcon @gasCookersIcon @laptopsIcon	
	 * @myCartIcon
	 */
	@FindBy(xpath = "//a[@id='navbarDropdown']")
	private WebElement allCatagoiesIcon;

	@FindBy(xpath = "(//a[text()=' Gift Cards '])[1]")
	private WebElement giftCardsIcon;

	@FindBy(xpath = "(//a[text()=' Digital Cards '])[1]")
	private WebElement digitalCardsIcon;

	@FindBy(xpath = "(//a[text()=' Air Conditioners '])[1]")
	private WebElement airConditionerIcon;

	@FindBy(xpath = "(//a[text()=' Mobile Phones '])[1]")
	private WebElement mobilePhonesIcon;

	@FindBy(xpath = "(//a[text()=' Refrigerators '])[1]")
	private WebElement refrigaratorsIcon;

	@FindBy(xpath = "(//a[text()=' Gas Cookers '])[1]")
	private WebElement gasCookersIcon;

	@FindBy(xpath = "(//a[text()=' Laptops '])[1]")
	private WebElement laptopsIcon;
	
	@FindBy(xpath = "(//div[text()='My Cart'])[1]")
	private WebElement myCartIcon;

	//Utilization - getters
	public WebElement getAllCatagoiesIcon() {
		return allCatagoiesIcon;
	}
	public WebElement getGiftCardsIcon() {
		return giftCardsIcon;
	}
	public WebElement getDigitalCardsIcon() {
		return digitalCardsIcon;
	}
	public WebElement getAirConditionerIcon() {
		return airConditionerIcon;
	}
	public WebElement getMobilePhonesIcon() {
		return mobilePhonesIcon;
	}
	public WebElement getRefrigaratorsIcon() {
		return refrigaratorsIcon;
	}
	public WebElement getGasCookersIcon() {
		return gasCookersIcon;
	}
	public WebElement getLaptopsIcon() {
		return laptopsIcon;
	}
	public WebElement getMyCartIcon() {
		return myCartIcon;
	}
	//Initialization
	public HomePage_EleBAY(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Business logic
	public void mouseOverOnAllCategories() {
		allCatagoiesIcon.click();
	}
	public void clickOnGiftCards() {
		giftCardsIcon.click();
	}
	public void clickOnDigitalCards() {
		digitalCardsIcon.click();
	}
	public void clickOnAirConditioner() {
		airConditionerIcon.click();
	}
	public void sendTextOnSeachbar(String searchText) {
		searchBarTextArea.sendKeys(searchText);
	}
	public void clickOnSearchButton() {
		searchBarTextArea.click();
	}
	public void clickOnMyCartIcon() {
		myCartIcon.click();
	}
}
