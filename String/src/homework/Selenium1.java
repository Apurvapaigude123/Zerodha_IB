package homework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Selenium1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
		driver.get("https://facebook.com");
	}
}
