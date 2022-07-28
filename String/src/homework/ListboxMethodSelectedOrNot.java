package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxMethodSelectedOrNot {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(1000);
			WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select s =new Select(month);
	
	boolean result = s.isMultiple();
	
	System.out.println(result);
	
	if(result==true) {
		System.out.println("list box is Multiple selectable");
	}
	else {
		System.out.println("list box is single selectable");
	

}
}
	
}