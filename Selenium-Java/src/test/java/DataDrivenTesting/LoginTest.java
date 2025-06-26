package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProvider = "logindata")
	public void logintest(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "logindata")
	public Object[][] getData(){
		ExcelUtils excel = new ExcelUtils("src/test/resources/test", "test");
		
		int rowCount = excel.getRowCount();
		
		Object[][] data = new Object[rowCount-1][2];
		
		//Object[][] data = new Object[4][2];
		
		for(int i=1; i<rowCount; i++) {
			data[i-1][0] = excel.getCell(i, 0);
			data[i-1][1] = excel.getCell(i, 1);
		}
		
		return data;
	}



}
