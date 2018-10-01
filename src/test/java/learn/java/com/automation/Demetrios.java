package learn.java.com.automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demetrios {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<WebElement> li = new ArrayList<WebElement>();	
		List<WebElement> li2 = new ArrayList<WebElement>();
		List<WebElement> li3 = new ArrayList<WebElement>();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://social-preprod.fds.com/social/demetrios-bridal/gown_gallery");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		li2 = driver.findElements(By.xpath("//*[@class = 'tileimg']"));
		
		for(WebElement el : li2)			
		{
			el.click();
			Thread.sleep(1000);	
			li = driver.findElements(By.xpath("//*[@class = 'popup_style']"));
			li.addAll(li);
		}
		
		System.out.println(li.size());
	}

}
