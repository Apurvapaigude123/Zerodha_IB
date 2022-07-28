package homework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignmentss1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Unstop.com/home");
		//Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='mob']")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("//span[@data-title='Login']")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("paigudeapurva123@gmail.com");
		  //Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Kabira08");
		  //Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  //Thread.sleep(1000);
		  Dimension a = new Dimension(1600, 1400);
		  driver.manage().window().setSize(a);  
		  
		Date d = new Date();
		String file = d.toString().replace(":","_").replace(" ", "_")+ ".png";
	Thread.sleep(4000);
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File y = new File("C:\\Users\\test\\Desktop\\SSFolder\\"+ file);
		FileHandler.copy(x, y);
		
	}

}
