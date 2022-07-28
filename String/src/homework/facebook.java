package homework;
import org.openqa.selenium.By;     // by using web element run application login
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe\\");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.id("email"));
		
		email.sendKeys("9527082878");
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("Kabira08");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
	}

}
