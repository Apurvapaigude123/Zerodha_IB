package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFocusFromiFreamToMainPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult"); //OR WebElement iframe1 =driver.findelement(By.xpath("//iframe[@id='iframeResult']");
		Thread.sleep(1000);                     //driver.switchTo.frame("iframe1");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent(); //driver.switchTo().parentFrame(); same works like default content


		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(1000);
		
	}

}
