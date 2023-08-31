package BAY_HomePageScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.utilities.BaseClass;

public class BackColourValTest extends BaseClass {

	@Test
	public void giftIconColourValTest() {
		String textCol = driver.findElement(By.xpath("(//a[text()=' Gift Cards '])[1]")).getCssValue("color");
		System.out.println(textCol);//rgba(33, 39, 56, 1)
		String actualHexa="#212738";
		String textHex = Color.fromString(textCol).asHex();
		System.out.println(textHex);//#212738
//validate using assertion		
		Assert.assertEquals(actualHexa, textHex);
		
	}
	
	@Test
	public void giftIconBackColValTest() {
		String textBagCol = driver.findElement(By.xpath("(//a[text()=' Gift Cards '])[2]")).getCssValue("background-color");
		String colorhex = Color.fromString(textBagCol).asHex();
		System.out.println(colorhex);
		
		
	}
}
