package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shubhu {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/myntra.com/");
		Thread.sleep(1000);
		driver.navigate().to("https:/tcs.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
		driver.switchTo();
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		//driver.get("http://facebook.com");
	}

}
 