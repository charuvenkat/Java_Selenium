package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		
		
		System.out.println("Excel started to read");
		
		//set the path of the excel workbook
		XSSFWorkbook excel = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//get into the sheet
		XSSFSheet sheet = excel.getSheetAt(0);
		
		//get no of rows from the excel
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count " + rowcount);
		
		//get defined rows..data present rows
		int rowhead = sheet.getPhysicalNumberOfRows();
		System.out.println("Physical no of rows  "  + rowhead);
		
		//get column count
		XSSFRow header = sheet.getRow(0);
		int colcount = header.getLastCellNum();
		System.out.println(colcount);
		
		String[][] data = new String[rowcount][colcount];
		
		//get the data from second row and fist column
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=0;j<colcount;j++)
			{			
				//Retrieve the data from the cell
			//	XSSFRow row = sheet.getRow(i);
			//	XSSFCell cell = row.getCell(j);
			//	String value = cell.getStringCellValue();(or) below line
				
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println("Cell value  " + value);
				data[i-1][j]= value;
			}
		}
		//close workbook
		excel.close();
		System.out.println("Excel closed");
		return data; 
		
	}

}
