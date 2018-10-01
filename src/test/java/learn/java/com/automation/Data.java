package learn.java.com.automation;

import java.io.File;
import java.io.FileInputStream;
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

public class Data {
	
	public WebDriver driver;
	File file = new File("a.xlsx");
	
	
	
	@BeforeMethod
	public  void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	
	@Test(dataProvider = "testdata")
	public void Login(String username, String password) throws IOException{
	
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/","Login not succesful");
		
	
	System.out.println("Login successful");
	driver.quit();
	
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

	
@DataProvider (name = "testdata") //it returns data into the testdata attribute
	public Object [] [] readexcel() throws IOException {
		//File file = new File("a.xlsx");
		boolean check = file.createNewFile();
		//System.out.println(check);
		
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook w = new XSSFWorkbook(inputStream);
		
		XSSFSheet s = w.getSheet("a");
		int rows = s.getLastRowNum() + 1;
		//System.out.println(rows);
	
		
		
		int col = s.getRow(0).getLastCellNum() ;
		//System.out.println(col);
		
		
		
		
		String input [] [] = new String [rows] [col];
		for (int i = 0; i<rows; i++)
       {
	   for (int j=0; j<col; j++){
		XSSFCell c = s.getRow(i).getCell(j);
		if(c.getCellTypeEnum() == CellType.NUMERIC)
		{
			input[i][j] = String.valueOf(c.getRawValue());
			
		}
		else
		{
         input [i][j] = c.getStringCellValue();
		}
		System.out.println(input[i][j]);
		//System.out.println(input[i][j]);
	}
}
		
		
		return input;
       
	}



}
