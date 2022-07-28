package homework;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SSDT {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.samsung.com");
Thread.sleep(1000);
driver.manage().window().maximize();
		
Date d =new Date();	
		
String FileName = d.toString().replace(":", "_").replace(" ", "_")+ ".png";
		
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
File dest = new File("C:\\Users\\test\\Pictures\\Screenshots\\" + FileName);
		
FileHandler.copy(source, dest);
		
driver.close();		
}}
