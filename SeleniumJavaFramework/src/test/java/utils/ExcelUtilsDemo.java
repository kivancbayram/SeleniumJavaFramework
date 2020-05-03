package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		ExcelUtils excel = new ExcelUtils("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx", "Sayfa1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumeric(1, 1);
	}
	
}
