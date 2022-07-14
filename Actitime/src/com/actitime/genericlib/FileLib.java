package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readPropertyData(String propertyPath, String key) throws Throwable
	{
		FileInputStream fis =new FileInputStream(propertyPath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key, "IncorrectKey");
	}
	
	
	public String readExcelData(String excelPath, String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	}
}










