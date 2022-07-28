package homework;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class PracticeSS {
	

		public static WebDriver driver;

		private static void captureScreenshot() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com/login/");
			Thread.sleep(1000);

			Date d = new Date();

			String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileHandler.copy(screenshot, new File("C:\\Users\\test\\Pictures\\Screenshots\\" + FileName));

		}
	}


