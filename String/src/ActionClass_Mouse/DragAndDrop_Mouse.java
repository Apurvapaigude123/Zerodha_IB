package ActionClass_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act = new Actions(driver);
		// act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		act.dragAndDrop(source, dest).scrollByAmount(100, 200).perform();
		
		//act.sendKeys(Keys.PAGE_UP).build().perform();// to scroll up page
		
		Thread.sleep(4000);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();// to scroll down page

		 js.executeScript("window.scrollBy(0,4000)");//scroll down
		 
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-4000)");//scroll up
		 
		 Thread.sleep(2000);

		 js.executeScript("window.scrollBy(4000,0)");//scroll right
		 
		 Thread.sleep(2000);

		 js.executeScript("window.scrollBy(-4000,0)");//scroll left


      
		 
	}
}
