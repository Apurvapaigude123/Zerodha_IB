package homework; //is enabled();

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsEnabledMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(1000);
	 WebElement SignUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
	 boolean result = SignUpButton.isEnabled();
	 if(result) {
		 System.out.println("Element Is Enabled");
	 }
	 else {
		 System.out.println("Element Is Disabled");
	 }
}

}
