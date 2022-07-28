package DataDrivenFramework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();// for disabling notifications
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://kite.zerodha.com/");
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); // deprecated method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
		String expctedUID = "OKP335";

		if (expctedUID.equals(ActualUID)) {
			System.out.println("Test Case pass:");
		} else

			System.out.println("Test Case Fail:");
	}
}
