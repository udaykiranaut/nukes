package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet 
{

	public static void main(String[] args) throws Exception
	{
		File src = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\TestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wb2 = HSSFWorkbook(fis);
		//XSSFSheet sh1 = wb.getSheet("Sheet1");
		XSSFSheet sh1 = wb.getSheetAt(0);
		sh1.getRow(0).createCell(2).setCellValue("Result");
		sh1.getRow(1).createCell(2).setCellValue("fail");
		sh1.getRow(2).createCell(2).setCellValue("pass");
		sh1.getRow(3).createCell(2).setCellValue("pass");
		sh1.getRow(4).createCell(2).setCellValue("123.321");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		System.out.println("excel updated");
		wb.close();
	}

}
