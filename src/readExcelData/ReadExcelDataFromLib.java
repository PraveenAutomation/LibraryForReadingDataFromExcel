package readExcelData;

import lib.ExcelDataConfig;

public class ReadExcelDataFromLib {
	
	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Dell\\Desktop\\Problem\\TestData.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
		System.out.println(excel.getData(0, 1, 0));
		System.out.println(excel.getData(1, 0, 0));
		System.out.println(excel.getData(1, 0, 1));
	}

}
