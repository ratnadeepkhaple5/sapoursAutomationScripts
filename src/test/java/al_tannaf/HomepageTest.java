package al_tannaf;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import altannaf_objectReposiratory.Homepage_Al;
import altannaf_objectReposiratory.LanguageSelectorPage_al;
import generic.utilities.BaseClass;

public class HomepageTest extends BaseClass{

	@Test
	public void mouseOverOnOurProducts() {

		LanguageSelectorPage_al lal=new LanguageSelectorPage_al(driver);
		Homepage_Al al=new Homepage_Al(driver);
		lal.clickOnEnglishButton();
	//	al.mouseOverOnOurProducts();
		Actions ac=new Actions(driver);
		
		ac.moveToElement(al.getOurProducts()).click().perform();

	}

}
