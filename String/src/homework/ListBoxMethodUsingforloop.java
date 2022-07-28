package homework;

import java.util.List; //by using for loop and get text();print all values in console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMethodUsingforloop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
     Select s =new Select(month);
     
  List<WebElement> options = s.getOptions();
  
  int size = options.size();
  
  System.out.println(options.size());
  
  for(int i=0;i<=options.size()-1;i++) {
	  
	  System.out.println(options.get(i).getText());
	  
  }

}}