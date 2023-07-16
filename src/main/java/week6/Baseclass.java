package week6;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Baseclass {

	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters ({"url","username","password"})	
	@BeforeTest
	public void precondition(String url, String uname,String pswd) {
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pswd);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterTest
	public void close() {
	driver.quit();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFileName);
	}
}
