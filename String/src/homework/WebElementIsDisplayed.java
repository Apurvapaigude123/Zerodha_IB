package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(1000);
	WebElement result = driver.findElement(By.xpath("//input[@name='custom_gender']"));
	Thread.sleep(1000);
	 boolean display = result.isDisplayed();
	System.out.println(display);
	}

}
