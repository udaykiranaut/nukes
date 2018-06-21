package poiHelper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig2 
{
	XSSFWorkbook wb ;
	XSSFSheet sh1;
	public ExcelDataConfig2(String ExcelPath)
	{
		try {
			File src = new File(ExcelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
		public String getData(int index , int row, int col)
		{
			sh1 = wb.getSheetAt(index);
			String data = sh1.getRow(row).getCell(col).getStringCellValue();
			return data;
		}
	public int getRowCount(int SheetIndex)
	{
		int row =  wb.getSheetAt(SheetIndex).getLastRowNum();
		row = row+1;
		//System.out.println("The number of rows are -- " +row);
		return row;
	}
	
		
	}

