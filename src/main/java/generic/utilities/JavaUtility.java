package generic.utilities;

import java.util.Date;
import java.util.Random;
/**
 * this class contains all the generic utilities related to "JAVA"
 * @author Ratnadeep_Khaple
 *
 */
public class JavaUtility {

	/**
	 * this method will return random number
	 * @return
	 */
	public int getRandomNumber() {
		Random random=new Random();
		int ranNo = random.nextInt(1000);
		return ranNo;
	}
	
	public String getSystemDate() {
		Date d=new Date();
		String date = d.toString();
		
		return date;
	}
	
	
}
