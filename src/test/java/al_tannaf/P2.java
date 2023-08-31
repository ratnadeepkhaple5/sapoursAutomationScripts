package al_tannaf;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import altannaf_objectReposiratory.LanguageSelectorPage_al;
import generic.utilities.BaseClass;

public class P2 extends BaseClass{

	@Test
	public void test() {
		
		LanguageSelectorPage_al al=new LanguageSelectorPage_al(driver);
		//al.clickOnEnglishButton();
		al.clickOnArabicButton();
		
	}
}
