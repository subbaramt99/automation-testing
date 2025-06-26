package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	Sheet sheet;

	public ExcelUtils(String filepath, String sheetname) {
		
		try {
			
		FileInputStream  fis = new FileInputStream("test.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		sheet = workbook.getSheet("test");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getCell(int row, int col) {
		return sheet.getRow(row).getCell(col).toString();
	}
	
	public int getRowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
}
