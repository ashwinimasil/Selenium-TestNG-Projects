package selenium_Automation_Projects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //get the window handle ids
		Iterator<String> it = windows.iterator();
		String Parentid = it.next();
		String Childid =it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		//driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String emailid=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(Parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		driver.findElement(By.id("password")).sendKeys("rahulshettyacademy");
		
	}

}
