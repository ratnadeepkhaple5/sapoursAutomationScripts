package generic.utilities;

import org.testng.annotations.DataProvider;

public class DataproviderBAY {

	
	@DataProvider
	public String[] WarrentyXPath() {
		
		String[] xpath=new String[] {
				"(//span[@class='ng-option-label ng-star-inserted'])[1]",
				"(//span[@class='ng-option-label ng-star-inserted'])[2]",
				"(//span[@class='ng-option-label ng-star-inserted'])[3]",
				"(//span[@class='ng-option-label ng-star-inserted'])[4]",
				"(//span[@class='ng-option-label ng-star-inserted'])[5]",
				"(//span[@class='ng-option-label ng-star-inserted'])[6]",
		};
		return xpath;
	}
}

