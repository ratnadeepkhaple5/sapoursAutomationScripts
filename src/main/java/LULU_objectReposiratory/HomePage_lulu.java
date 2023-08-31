package LULU_objectReposiratory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_lulu {

	WebDriver driver;
//Header element	
	@FindBy(xpath = "//*[@id='js-site-search-input auto-search']")
	private WebElement searchTextArea;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement hitSearchSubmitButton;
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement loginButton;
	
	public WebElement getHitSearchSubmitButton() {
		return hitSearchSubmitButton;
	}

	@FindBy(xpath = "//a[@href='/en-in/cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "(//*[@href='/en-in/'])[1]")
	private WebElement luluLogoImage;
	//   (//*[@href='/en-in/'])[1]
	//   (//*[@title='LuLu-Logo-bottom-ENG.png'])[1]
	@FindBy(id = "homeDeliveryButton")
	private WebElement homeDeliveryButton;

	
//Navigation bar elements
	
	@FindBy(xpath = "//span[@class='all-category-icon']")
	private WebElement allCategoryIcon;
	
	@FindBy(xpath = "//a[text()='GROCERY']")
	private WebElement groceryIcon;
	
	@FindBy(xpath = "//a[text()='FRESH FOOD']")
	private WebElement freshFoodIcon;
	
	@FindBy(xpath = "//a[text()='ELECTRONICS']")
	private WebElement electronicsIcon;
	
	@FindBy(xpath = "//a[text()='MOBILES']")
	private WebElement mobilesIcon;
	
	@FindBy(xpath = "//a[text()='LIFESTYLE']")
	private WebElement lifestylesIcon;
	
	@FindBy(xpath = "//a[text()='HOME & LIVING']")
	private WebElement homeAndLivingIcon;
	
	public HomePage_lulu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchTextArea() {
		return searchTextArea;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getLuluLogoImage() {
		return luluLogoImage;
	}

	public WebElement getHomeDeliveryButton() {
		return homeDeliveryButton;
	}

	public WebElement getAllCategoryIcon() {
		return allCategoryIcon;
	}

	public WebElement getGroceryIcon() {
		return groceryIcon;
	}

	public WebElement getFreshFoodIcon() {
		return freshFoodIcon;
	}

	public WebElement getElectronicsIcon() {
		return electronicsIcon;
	}

	public WebElement getMobilesIcon() {
		return mobilesIcon;
	}

	public WebElement getLifestylesIcon() {
		return lifestylesIcon;
	}

	public WebElement getHomeAndLivingIcon() {
		return homeAndLivingIcon;
	}
	
	public void searchTextOnLulu(String text) {
		searchTextArea.sendKeys(text);
	}
	public void clickSearchSubmitButton() {
		hitSearchSubmitButton.click();
	}
}
