package poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_HardCode 
{

	public static void main(String[] args) throws Exception
	{
		File src = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\TestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wb2 = HSSFWorkbook(fis);
		//XSSFSheet sh1 = wb.getSheet("Sheet1");
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		String data0 = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel sheet  is " +data0);
		String data1 = sh1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel sheet  is " +data1);
		wb.close();

	}

}
