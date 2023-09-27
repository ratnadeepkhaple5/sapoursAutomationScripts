package generic.utilities;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;
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
	
	
	public String getSystemDateFormat() {

		Date d=new Date();
	//	System.out.println(date.toString());// Fri Sep 15 14:20:51 IST 2023
		//  0   1   2    3		4   5
		
		String[] dArr = d.toString().split(" ");

		String date = dArr[2];
		String month=dArr[1];
		String year=dArr[5];
		String time=dArr[3].replace(":", "-");

		String DateFormat= date+" "+month+" "+year+" "+time;
	//	System.out.println(DateFormat);
		return DateFormat;

	}




}
