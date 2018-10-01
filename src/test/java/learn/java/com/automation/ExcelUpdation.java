package learn.java.com.automation;

	import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
	import java.util.Scanner;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class ExcelUpdation {
		
	public static void main(String args[]) throws IOException{
		
			File file = new File("a.xlsx");
			
			FileInputStream input = new FileInputStream(file);
			XSSFWorkbook w = new XSSFWorkbook(input);
			
			XSSFSheet s = w.getSheet("a");
			/*int rowCount = s.getLastRowNum() + 1;
			System.out.println(rowCount);
		
			int colCount = s.getRow(0).getLastCellNum() ;
			System.out.println(colCount);*/
			
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("Username");
		s.getRow(0).createCell(1).setCellValue("Password");
		s.getRow(0).createCell(2).setCellValue("Result");
		FileOutputStream output = new FileOutputStream(file);
		w.write(output);
		
		}

	}
	

