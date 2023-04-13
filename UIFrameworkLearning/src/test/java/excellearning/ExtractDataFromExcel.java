package excellearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExtractDataFromExcel {


	public Object[][] getExcelData(){
		//Object[][] data;
		
		Object[][] data = excelReading(System.getProperty("user.dir") + "/excel/readdatafromexcel.xlsx", "learning");
		return data;
		
		
	}

	private Object[][] excelReading(String excelPath, String sheetName) {
		
		Object[][] excelData = null;
		XSSFWorkbook workbook=null;
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			XSSFRow row = worksheet.getRow(0);
			int noOfRows = worksheet.getPhysicalNumberOfRows();
			int noOfColumns = row.getPhysicalNumberOfCells();
			excelData= new Object[noOfRows-1][noOfColumns];
		}
		// TODO Auto-generated method stub
		return null;
	}

		
	
}
