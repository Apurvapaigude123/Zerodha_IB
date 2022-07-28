package PopUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpAutomate {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();//new tab
	
	
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al = new ArrayList<String>(ids);
	
	       //String CWID = al.get(1);//child browser address
	       
	       driver.switchTo().window(al.get(1));
	       
	       Thread.sleep(1000);

	    
	       
	       driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	      
	       Thread.sleep(1000);
	       
	       driver.switchTo().window(al.get(2));
	       Thread.sleep(2000);
	       driver.close();

	      
	       
	        	
	
}
}
