package homework;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SS1 {
public static WebDriver driver;
private static void captureScreenshot() throws IOException {
   Date d = new Date();
   String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(screenshot, new File("C:\\Users\\test\\Pictures\\Screenshots\\" + FileName));
	}
public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		captureScreenshot();
		//driver.findElement(By.xpath("//button[@Value='1']")).click();
		//captureScreenshot();
}}