package al_tannaf;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.utilities.ExcelUtility;

public class ReadData {

	@Test
	public void test() throws Exception, IOException {
		
		ExcelUtility exl=new ExcelUtility();
		
		String data = exl.readDataFromExcel("Sheet1",2 ,2 );
		
		System.out.println(data);
	}
}
