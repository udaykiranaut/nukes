package poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDynamic1 
{

	public static void main(String[] args) throws Exception 
	{
		//File scr1 = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\Testdata0.xlsx");
		File scr1 = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\boysandgirls.xlsx");
		FileInputStream inp2 = new FileInputStream(scr1);
		XSSFWorkbook wb = new XSSFWorkbook(inp2);
		XSSFSheet sh1 = wb.getSheetAt(0);
		int rowcount = sh1.getLastRowNum();
		System.out.println("The Total number of rows are --" +rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			String data0 = sh1.getRow(i).getCell(0).getStringCellValue();
			//System.out.println("Test  data from excel sheet is " +data0);
			System.out.println("Data from row -- " +i +"-- is " +data0);
		}
		wb.close();
		


	}

}
