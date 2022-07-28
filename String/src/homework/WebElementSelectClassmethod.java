package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementSelectClassmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
Select s =new Select(day);
//s.selectByIndex(15);
//s.selectByValue("16");
s.selectByVisibleText("16");
Thread.sleep(1000);
WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
 Select t = new Select(month);
 t.selectByIndex(0);
 Thread.sleep(1000);
 WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
 Select u =new Select(year);
 u.selectByValue("1998");
 



}}
