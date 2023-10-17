package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getstringcellValue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis); 
		String cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	
	public static boolean getbooleancellValue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis); 
		boolean cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return cellValue;
	}
	
	public static Date getdatecellValue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis); 
		Date cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return cellValue;
	}
	
	public static double getnumericcellValue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis); 
		double cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellValue;
	}
}