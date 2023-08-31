package generic.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class contains methods regarding the operations of Excel
 * @author Ratnadeep_Khaple
 *
 */
public class ExcelUtility {
/**
 * this method will read the data from exel
 * @param sheet
 * @param rowNum
 * @param getColumn
 * @return value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readDataFromExcel(String sheet,int rowNum, int getColumn) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(IconstantUtility.excelFilePath);
//create work-Book		
		Workbook workbook = WorkbookFactory.create(fis);
//get sheet		
		 Sheet sh = workbook.getSheet(sheet);
//get row		
		 Row row = sh.getRow(rowNum);
//get column / cell	
		Cell column = row.getCell(getColumn);
//get value from particular cell & return		
		String value = column.getStringCellValue();
		
		return value;
	}
}
