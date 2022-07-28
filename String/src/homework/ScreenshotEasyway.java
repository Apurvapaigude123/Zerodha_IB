package homework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEasyway {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com");

		Thread.sleep(1000);
		Date d = new Date();
     System.out.println(d);
		String t = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File z = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File x = new File("C:\\Users\\test\\Desktop\\SSFolder\\" + t);

		FileHandler.copy(z, x);
	}

}
