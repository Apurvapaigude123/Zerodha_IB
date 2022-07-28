package homework;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class selenium_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/login/");
		Thread.sleep(1000);
		
		Date d = new Date(28/06/2022);

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
		String random = RandomString.make(2);
		
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("C:\\Users\\test\\Pictures\\Screenshots\\clone"+random+".jpg");
	 FileHandler.copy(source, dest);
	}
}
