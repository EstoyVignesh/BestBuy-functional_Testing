package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		String excelPath = "./src/test/resources/data.xlsx";
		
		FileInputStream file = new FileInputStream(excelPath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		String val = workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(val);
	}

}
