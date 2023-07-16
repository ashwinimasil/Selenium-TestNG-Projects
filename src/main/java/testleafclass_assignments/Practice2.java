package testleafclass_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.get("https://login.salesforce.com/");
 driver.manage().window().maximize();
 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
 WebElement password = driver.findElement(By.name("pw"));
 password.sendKeys("Leaf@1234");
 driver.findElement(By.name("Login")).click();
 String Title = driver.getTitle();
 System.out.println(Title);
 System.out.println();
 
 
 
 
	}

}
