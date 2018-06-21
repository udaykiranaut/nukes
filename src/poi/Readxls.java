package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Readxls
{

	public static void main(String[] args) throws Exception 
	{
		File f1 = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\Boys_and_Girls.xls");
		FileInputStream i1 = new FileInputStream(f1);
		HSSFWorkbook wb = new HSSFWorkbook(i1);
		HSSFSheet hs1= wb.getSheetAt(0);
		int total_rows = hs1.getLastRowNum();
		System.out.println("The total number of rows are -- " +total_rows);
		
		for(int k=0;k<=total_rows;k++)
		{
			
			String data1 = hs1.getRow(k).getCell(1).getStringCellValue();
			System.out.println("The data at cell no  -- " +k +"--is --" +data1);
		}
		wb.close();
		
		

	}

}
