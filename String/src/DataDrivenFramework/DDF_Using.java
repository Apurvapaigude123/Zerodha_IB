package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF_Using {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Documents\\Zerodha_TestData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// entering UN using DDF
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);

		// entering PWD using DDF
		String PWD = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String PIN = sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	 String ActualUN = sh.getRow(3).getCell(0).getStringCellValue();

	 driver.findElement(By.xpath("//span[text()='OKP335']")).getText();

	  if(UN.equals(ActualUN)) {
		  System.out.println("Pass");
	  }else
		  System.out.println("Fail");
	
	}

}
