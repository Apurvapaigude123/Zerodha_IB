package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1SS {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String b = driver.getTitle();
		//Thread.sleep(1000);
		//String a = driver.getCurrentUrl();
		System.out.println(b);
		
		Date d = new Date();
		String file = d.toString().replace(":", "_").replace(" ", "_")+".png";
		
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File y = new File("C:\\Users\\test\\Desktop\\SSFolder\\"+file);
		 FileHandler.copy(x, y);
		}

}
