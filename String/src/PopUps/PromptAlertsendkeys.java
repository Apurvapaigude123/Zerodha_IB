package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertsendkeys {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	  
	  Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("No");
		Thread.sleep(1000);
		
		String text = driver.switchTo().alert().getText();
		 System.out.println(text); //used to print text from popup
		 
		driver.switchTo().alert().accept();
	}

}
