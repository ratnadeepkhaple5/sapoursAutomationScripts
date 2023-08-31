package bdd_SDF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.en.*;

public class SDF_1{
	WebDriver driver;

	@Given("go to {string}")
	public void go_to(String url) {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Then("Search text xpath {string} {string}")
	public void search_text_xpath(String searchXpath, String productName) {
		driver.findElement(By.xpath(searchXpath)).sendKeys(productName, Keys.ENTER);

	}
	@Then("close the app")
	public void close_the_app() {
		//   driver.quit();
	}

}
