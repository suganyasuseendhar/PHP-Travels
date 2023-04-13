package excellearning;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ExcelLearning {

	@Test
	public void excelLearning() throws IOException {
		
		String projPath = System.getProperty("user.dir"); 
		System.out.println(projPath);
		
		
		XSSFWorkbook workBook = new XSSFWorkbook(projPath+"\\Excel\\keyword.xlsx");
		XSSFSheet workSheet = workBook.getSheetAt(0);
		int rowCount = workSheet.getPhysicalNumberOfRows(); 	//how many rows has value
		System.out.println(rowCount);
		
		String keyword;
		int result;
		
		for(int i =1;i<rowCount;i++) {
			keyword=workSheet.getRow(i).getCell(0).getStringCellValue();
			result = (int) workSheet.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(keyword + "\t \t" + result);
		}
		workBook.close();
	}

@Test	
public void newExcelLearning() throws Exception {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);
	
	XSSFWorkbook workBook1 = new XSSFWorkbook(projectPath+"\\Excel\\keyword.xlsx");
	XSSFSheet workSheet1 = workBook1.getSheetAt(0);
	int rowCount1 = workSheet1.getPhysicalNumberOfRows();
	System.out.println(rowCount1);
	
	//String keyword1;
	int result1;
	int keyword1;
	
	for(int i=1; i<rowCount1;i++) {
		
		//keyword1 = workSheet1.getRow(i).getCell(0).getStringCellValue();
		keyword1 = (int) workSheet1.getRow(i).getCell(0).getNumericCellValue();
		result1 = (int) workSheet1.getRow(i).getCell(1).getNumericCellValue();
		System.out.println(keyword1 + "\t \t" + result1);
	}
	workBook1.close();
}	
	
}
	
	
	

