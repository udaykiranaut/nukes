package jexcel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJexcelHardCode
{

	public static void main(String[] args) throws Exception
	{
		File src = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\Boys_and_Girls.xls");
		System.out.println("Excel Located");
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("workbook loaded");
		// first argument is column and 2nd is row
		String data00 = wb.getSheet(1).getCell(0,0).getContents();
		String data10 = wb.getSheet(1).getCell(1, 0).getContents();
		String data01 = wb.getSheet(1).getCell(0, 1).getContents();
		String data11 = wb.getSheet(1).getCell(1, 1).getContents();
		System.out.println("The data is ---" +data00 +"--" +data10);
		
		System.out.println("The data is ---" +data01 +"--" +data11);
		
		wb.close();
		System.out.println("workbook closed");
		
				
				

	}

}
