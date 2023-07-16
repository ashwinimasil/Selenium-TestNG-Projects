package homework_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateFBaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver(); // ClassName objName = new ClassName();
		driver.get("https://en-gb.facebook.com/");
		// accept cookies
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		// create new account
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.name("firstname")).sendKeys("Ash");
		driver.findElement(By.name("lastname")).sendKeys("Rajasekaran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ashwinimasil@gmail.com");
		// xpath -- //input[@type='password'] getting the error as Element not
		// interactable
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rajash123$");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("24");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("06");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1984");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
