package homework;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Dimension D = new Dimension (300,400);  // for changing dimension of page in x and y axis
		driver.manage().window().setSize(D);
		
		Thread.sleep(1000);
	
		Point p = new Point(400,200); //for changing size here we create object of point
	driver.manage().window().setPosition(p);
	}

}
