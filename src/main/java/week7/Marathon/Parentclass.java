package week7.Marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Parentclass {
	public ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	public void precondition() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		// driver.quit();
		driver.findElement(By.id("username")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rajash123$");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		System.out.println("toggle clicked");
		Thread.sleep(5000);
		// view all link
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
	}
	@AfterMethod
	public void close() 
	{
		driver.quit();
	}
	
	@DataProvider(name="sendData")
	public String[][] sendData() throws IOException {
		return ReadExcelQuestions.readExcel(excelFileName);
	}
	
}
