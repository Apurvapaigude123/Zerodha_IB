package homework;
                     //by using getoptions(); fetching size of list box containts
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMethods {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(1000);
			WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select s =new Select(month);
	  List<WebElement> options = s.getOptions();
	  int size = options.size();
	  System.out.println(size);
	}

}
