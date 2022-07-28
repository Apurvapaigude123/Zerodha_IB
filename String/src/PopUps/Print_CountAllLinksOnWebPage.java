package PopUps;       //FindElements print all links & count

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_CountAllLinksOnWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for(int a =0;a<links.size();a++) {
			System.out.println(links.get(a).getText()+":"+links.get(a).getAttribute("href"));
		}
	}

}
