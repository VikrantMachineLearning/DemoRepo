package learn.java.com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class Test {
	
	//public WebDriver driver; 
	
	
	public static void main(String[] args) throws IOException
	{
	
		
	/*	Login(readexcel());
		
	}	
	
	public static void Login(String input [] []){
	
	
		String username = input[0][0];
		String password = input[0][1];
		System.out.println(username);
        System.out.println(password);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/","Login failed");
	System.out.println("LogIn successful");
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
	
	

	public static String [] [] readexcel() throws IOException {*/
		File file = new File("a.xlsx");
		//boolean check = file.createNewFile();
		//System.out.println(check);
		file.createNewFile();
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook w = new XSSFWorkbook(inputStream);
		
		XSSFSheet s = w.getSheet("a");
		int rows = s.getLastRowNum() + 1;
		//System.out.println(rows);
		
		
		
		int col = s.getRow(0).getLastCellNum() ;
		//System.out.println(col);
		
		
		//String input [] [] = new String [rows] [col]; //capture rows & columns values
		String input [] [] = new String [rows] [col]; //capture rows & columns values
	      
		for (int i = 0; i<rows; i++)
       {
	   for (int j=0; j<col; j++){
		XSSFCell c = s.getRow(i).getCell(j);
		input [i][j] = c.getStringCellValue();
		System.out.println(input[i][j]);
	
	  }
      }
		
		//return input; 
	}

}

