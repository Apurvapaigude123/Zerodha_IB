package homework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.meesho.com");
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String random = RandomString.make(3);
	 File dest = new File("C:\\Users\\test\\Pictures\\Screenshots\\result"+random+".jpg");
	  FileHandler.copy(source, dest);
		
	}

}
