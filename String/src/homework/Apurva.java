package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apurva {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();// upcasting
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(1000);
	
	driver.switchTo().newWindow(WindowType.TAB);//for new tab
	
	Thread.sleep(1000);// for time break
	
	driver.get("https://www.facebook.com/");
	
	String title =driver.getTitle();// for get title
	System.out.println(title);
	
	String exptitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
if(title.equalsIgnoreCase(exptitle)) { // checking expected and actual url
	System.out.println("Navigate to right page");
}
else {
	System.out.println("Navigate to wrong page");
}
Thread.sleep(1000);
driver.manage().window().maximize();// max the tab
Thread.sleep(1000);
driver.manage().window().minimize();// min the tab
Thread.sleep(1000);
driver.manage().window().maximize();
String url= driver.getCurrentUrl();// get current url
System.out.println(url);

}

}
