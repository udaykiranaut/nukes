package jexcel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJexcelDynamic
{
	
	public static void main(String[] args) throws Exception
	{
		String column;
		String row;
		File src = new File("E:\\01 for testing\\selinium mukesh\\ExcelData\\Boys_and_Girls.xls");
		System.out.println("Excel Located");
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("workbook loaded");
		int row_count = wb.getSheet(1).getRows();
		int column_count = wb.getSheet(1).getColumns();
		System.out.println("The number of rows and columns respectively are ---" +row_count +"---"+column_count);
		// first argument is column and 2nd is row
		String data00 = wb.getSheet(1).getCell(0,0).getContents();
		System.out.println("The data is ---" +data00);
		for(int j=0;j<column_count;j++)
		{
			
			for(int i=0;i<row_count;i++)
			{
				column= wb.getSheet(1).getCell(j,i).getContents();
				System.out.println("The data of column and row is " +column);	
			}
		}
		wb.close();
		System.out.println("workbook closed");
	}
}
