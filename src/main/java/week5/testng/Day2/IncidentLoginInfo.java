package week5.testng.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.errorprone.annotations.Var;

import io.github.sukgu.Shadow;

public class IncidentLoginInfo {
	public static ChromeDriver driver;
	public static String incidentnumber;

	@BeforeMethod
	public void IncidentLogin() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://dev70206.service-now.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();

	}

	@AfterMethod
	public void close() {
		// driver.close();
	}

}
