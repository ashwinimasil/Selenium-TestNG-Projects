package homework_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead{
public static void main(String[] args){
	// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abcd");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ash");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Masil");
driver.findElement(By.name("firstNameLocal")).sendKeys("Ash");
driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Looking for an Senior lead ");
driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("ashwinimasil@gmail.com");
driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")).click();
WebElement State = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
Select stateobject = new Select(State);
stateobject.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
System.out.println(driver.getTitle());
}
}