package ashwini_JavaProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Rahulshettyacademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.name("password")).sendKeys("fasjlfkdasj");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.xpath(("//span[@class='text-with-icon']"))).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("email")).clear();
		Thread.sleep(100);
		driver.findElement(By.id("email")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.xpath("//input[@name='commit']")).click();// Next button click*/
		System.out.println("The End");
		//driver.close();
	}

}
