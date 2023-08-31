package generic.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contains all the generic methods related to property files
 * 
 * @author Ratnadeep_Khaple
 */
public class PropertyFileUtility {

	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IconstantUtility.propertyPath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
}
