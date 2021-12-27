package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInteg {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook excel = new XSSFWorkbook("./data/CeateLead.xlsx");
		XSSFSheet sheet = excel.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short colcount = sheet.getRow(0).getLastCellNum();
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=0;j<colcount;j++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
	}

}
