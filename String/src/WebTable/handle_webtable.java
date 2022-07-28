package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_webtable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		List<WebElement> noofRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		//no of row present in web table
		System.out.println("No of Rows:"+ noofRow.size());
		
		for(int i =1;i<noofRow.size();i++) {
			List<WebElement> noofCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("Row No :"+ i +" No of Cell : "+noofCell.size());
			
			for(int Cell=0;Cell<noofCell.size();Cell++) {
				
				System.out.print(noofCell.get(Cell).getText()+"|");
			}
			System.out.println();
		}
	}
}
	


