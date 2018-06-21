package poiHelper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
	XSSFWorkbook wb ;
	XSSFSheet sh1;
	public ExcelDataConfig(String ExcelPath)
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
		
		
	}

