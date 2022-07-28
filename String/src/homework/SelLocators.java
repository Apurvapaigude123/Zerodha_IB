package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//driver.get("http://www.facebook.com/login/");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9527082878");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kabira08");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(1000)
		//driver.findElement(By.xpath("//a[contains(@href,'/login/')][1]")).click();
		driver.get("http://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("paigudeapurva123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input [@name='password']")).sendKeys("Apurva98");
		Thread.sleep(1000);
		Boolean result =driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).isEnabled();
		System.out.println(result);
		if(result==true) {
			System.out.println("Button is enable");
		}
		else
		{
			System.out.println("Button is disable");
		}
		//Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[3]/div/button/div/svg/line[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//body[contains(@class,'_a3wf system')]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_Ae\"]/div/div[1]/div/div[1]/div/div/div[1]/div[1]/section/nav/div[2]/div/div/div[3]/div/div[2]/a/svg")).click();
		
       
		


		
		
		
	}

}
