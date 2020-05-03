package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	// constructor
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumeric(1,1);
		
	}

		public static int getRowCount() {
			
			int rowCount = 0;
			try {
				//workbook = new XSSFWorkbook("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
				//sheet = workbook.getSheet("Sayfa1");
				
				//asagýdaki satýrda excel dosyasýnýn satýrlarýna ulasmamýz lazým
				rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("No of rows : "+rowCount);
				
			} catch (Exception exp) {
				
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return rowCount;
			

		
		
		}
		
		public static int getColCount() {
			
			int colCount = 0;
			try {
				//workbook = new XSSFWorkbook("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
				//sheet = workbook.getSheet("Sayfa1");
				
				//asagýdaki satýrda excel dosyasýnýn satýrlarýna ulasmamýz lazým
				colCount = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("No of columns : "+colCount);
				
			} catch (Exception exp) {
				
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
			return colCount;
			

		
		
		}
		public static String getCellDataString(int rowNum, int colNum) {
			
				String cellData=null ;
			try {
				//workbook = new XSSFWorkbook("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
				//sheet = workbook.getSheet("Sayfa1");
				cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();  // for string value
				//System.out.println(cellData);
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
			return cellData;
			
		}
		
		public static void getCellDataNumeric(int rowNum, int colNum) {
			
			try {
				//workbook = new XSSFWorkbook("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
				//sheet = workbook.getSheet("Sayfa1");
				double numericCellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue(); // for numeric value
				System.out.println(numericCellData);
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
	
}
}
