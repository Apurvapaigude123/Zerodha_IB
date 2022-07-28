package homework; // is selected();

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebelementMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement female = driver.findElement(By.xpath("//input[@type='radio'][1]"));
	female.click();
	Thread.sleep(1000);
	//boolean result =female.isSelected();
	//System.out.println(result);
	//if(result==true) {
		//System.out.println("Element Is Selected");
		
	//}
	//else {
		//System.out.println("Element Is Not Selected");
	//}
	
	}

}
