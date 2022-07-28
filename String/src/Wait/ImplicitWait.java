package Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// selenium 3.141.59
		//selenium 4+
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apurva");
}
}