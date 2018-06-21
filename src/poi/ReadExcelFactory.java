package poi;

import poiHelper.ExcelDataConfig;

public class ReadExcelFactory {

	public static void main(String[] args) 
	{
		ExcelDataConfig obj1 = new ExcelDataConfig("E:\\01 for testing\\selinium mukesh\\ExcelData\\boysandgirls.xlsx");
		
		System.out.println(obj1.getData(1, 0, 0));

	}

}
