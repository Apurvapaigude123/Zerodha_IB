package homework;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS3 {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.twitter.com");
		//Date d =new Date();	
		//String FileName = d.toString().replace(":", "_").replace(" ", "_")+ ".jpg";
	for(int i =1;i<=5;i++) 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		 File dest = new File("C:\\Users\\test\\Pictures\\Screenshots\\AS"+i+".jpg");
		  FileHandler.copy(source, dest);	
	  }
    }
	}
